
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mertdemirok
 */
public class HashMap<K, V> {

    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }

    public void grow() {
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }

        this.values = newArray;
    }

    private void copy(ArrayList<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].get(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);

        }
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);

        if (this.values[hashValue] == null) {
            return null;
        }

        ArrayList<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {

        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);

        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        ArrayList<Pair<K, V>> list = getListBasedOnKey(key);
        if (list.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(list, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = list.get(index);
        list.remove(index);
        return pair.getValue();
    }

    public ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);

        if (this.values[hashValue] == null) {
            this.values[hashValue] = new ArrayList<>();
        }

        return this.values[hashValue];
    }

    public int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key) {

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

}

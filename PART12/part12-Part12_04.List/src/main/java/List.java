/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (firstFreeIndex == values.length) {
            this.grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;

    }

    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }

        moveToLeft(indexOfValue);
        firstFreeIndex--;
    }

    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public Type value(int index) {
        if (index < 0 || index >= firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return values[index];

    }

    private void moveToLeft(int fromIndex) {
        for (int i = fromIndex; i < firstFreeIndex - 1; i++) {
            values[i] = values[i + 1];
        }
    }

    private void grow() {
        int newSize = values.length + values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];

        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }

    public int size() {
        return this.firstFreeIndex;
    }

}

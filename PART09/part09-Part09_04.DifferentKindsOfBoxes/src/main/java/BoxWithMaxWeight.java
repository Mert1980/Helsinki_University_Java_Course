
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
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        if (isInBox(item)) {
            return;
        }
        if (this.getCapacity() - item.getWeight() >= 0) {
            items.add(item);
            this.setCapacity(this.getCapacity() - item.getWeight());
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

}

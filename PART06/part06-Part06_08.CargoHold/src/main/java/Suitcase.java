/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        if (inLimit(item)) {
            items.add(item);
        }
    }

    public boolean inLimit(Item item) {
        return (this.totalWeight() + item.getWeight()) <= this.maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items(0 kg)";
        } else {
            String text = "";
            String itemText = items.size() == 1 ? "item" : "items";
            text = text + items.size() + " " + itemText + " (" + this.totalWeight() + " kg)";
            return text;
        }
    }
}

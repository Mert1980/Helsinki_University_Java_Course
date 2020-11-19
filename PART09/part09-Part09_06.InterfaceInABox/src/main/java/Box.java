
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
public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maximumCapacity;

    public Box(double maximumCapacity) {
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }

    public void add(Packable item) {
        double totalWeight = weight();
        if (totalWeight + item.weight() <= maximumCapacity) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.items) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + items.size() + " items, " + "total weight " + weight() + " kg";
    }

}

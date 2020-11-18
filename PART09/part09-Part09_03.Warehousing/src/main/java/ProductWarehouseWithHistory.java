/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.setBalance(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n"
                + "History: " + this.history() + "\n"
                + "Largest amount of product: " + history.maxValue() + "\n"
                + "Smallest amount of product: " + history.minValue() + "\n"
                + "Average: " + history.average());
    }

    public String history() {
        return this.history.toString();
    }
}

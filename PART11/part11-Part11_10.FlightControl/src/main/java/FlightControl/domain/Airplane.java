/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author mertdemirok
 */
public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append(id).append(" (")
                .append(capacity)
                .append(" capacity)");
        return text.toString();
    }

}

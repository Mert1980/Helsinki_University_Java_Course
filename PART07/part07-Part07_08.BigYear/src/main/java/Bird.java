/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class Bird {
    private String name;
    private String latinName;
    private int numberOfObservations = 0;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getNumberOfObservations() {
        return numberOfObservations;
    }

    public void increaseNumberOfObservations() {
        this.numberOfObservations++;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getLatinName() + ") " + this.getNumberOfObservations() + " observations";
    }
}

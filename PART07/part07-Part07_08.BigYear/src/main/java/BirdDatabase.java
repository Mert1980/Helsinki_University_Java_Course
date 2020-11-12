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

public class BirdDatabase {

    private ArrayList<Bird> birds;
    //private ArrayList<String> observations;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
        //this.observations = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public void addObservation(String name) {
                
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
               
                bird.increaseNumberOfObservations();
               
                return;
            }         
        }
        System.out.println("Not a bird!");
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
}


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
public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable member : herd) {
            member.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String text = "";
        for (Movable member : herd) {
            text += member + "\n";
        }
        return text;
    }

}

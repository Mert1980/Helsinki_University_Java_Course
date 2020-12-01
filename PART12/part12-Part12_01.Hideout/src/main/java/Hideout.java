/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class Hideout<T> {

    private T inHiding;

    public void putIntoHideout(T toHide) {
        this.inHiding = toHide;
    }

    public boolean isInHideout() {
        return this.inHiding != null;
    }

    public T takeFromHideout() {
        T previouslyInHiding = this.inHiding;
        this.inHiding = null;
        return previouslyInHiding;
    }

}

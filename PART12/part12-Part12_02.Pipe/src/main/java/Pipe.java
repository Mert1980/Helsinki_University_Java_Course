
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
public class Pipe<T> {
    private ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }    
    
    public void putIntoPipe(T value){
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        if (pipe.isEmpty()){
            return null;
        }
        
        T toBeTaken = pipe.get(0);
        pipe.remove(toBeTaken);
        return toBeTaken;
    }
    
    public boolean isInPipe(){
        return !pipe.isEmpty();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class Container {
    private int volume;
    private int capacity;
    
    public Container(){
        this.capacity = 100;
    }
    
    public int contains(){
        return this.volume;
    }
    
    public void add(int amount){
        if(amount > 0){
            this.volume+=amount;
        }
        if(this.volume > this.capacity){
            this.volume = this.capacity;
        }
    }
        
    public void remove(int amount){
        if(amount >= this.volume){
            this.volume = 0;
            return;
        }
        if(amount > 0){
            this.volume-=amount;
        }
         
    }
    
    public String toString(){
        return this.volume + "/100";
    }
    
}

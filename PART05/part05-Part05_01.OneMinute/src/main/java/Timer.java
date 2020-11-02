/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand miliSeconds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.miliSeconds = new ClockHand(100);
    }
    
    public void advance(){
        this.miliSeconds.advance();
        
        if(this.miliSeconds.value() == 0){
            this.seconds.advance();
        }
    }
    
    public String toString(){
        return seconds + ":" + miliSeconds;
    }
    
}

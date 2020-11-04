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
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){
        if(jokes.isEmpty()){
            String message = "Jokes are in short supply.";
            return message;            
        }
        
        Random rand = new Random();
        int index = rand.nextInt(jokes.size());
        return jokes.get(index);
    }
    
    public void printJokes(){
        System.out.println("Printing the jokes.");
        for(String joke:this.jokes){
            System.out.println(joke);
        }
    }
    
}

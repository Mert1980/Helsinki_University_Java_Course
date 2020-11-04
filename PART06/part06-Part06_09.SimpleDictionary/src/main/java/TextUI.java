/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String text = this.scanner.nextLine();
            
            if(text.contains("end")){
                System.out.println("Bye bye!");
                break;
            }
            
            if(text.contains("add")){
                this.addToDictionary();
                continue;
            }
            
            if(text.contains("search")){
                this.search();
                continue;
            }
            System.out.println("Unknown command");          
        }
    }  
    
    public void addToDictionary(){
        System.out.print("Word: ");
        String word = scanner.nextLine();
        
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        
        dictionary.add(word, translation);
    }
    
    public void search(){
        System.out.print("To be translated: ");
        String toBeTranslated = scanner.nextLine();
        
        if(dictionary.translate(toBeTranslated) == null){
            System.out.println("Word " + toBeTranslated + " was not found");
            return;
        }
        
        System.out.println("Translation: " + dictionary.translate(toBeTranslated));
    }
}

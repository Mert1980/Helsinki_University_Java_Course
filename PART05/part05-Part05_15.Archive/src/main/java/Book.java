/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public class Book {
    private String name;
    private String identifier;

    public Book(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Object compared){
        // if the variables share the same address, they are equal
        if(this == compared){
            return true;
        }
        
        // if the compared object is not of type Book, the objects are not equall
        if(!(compared instanceof Book)){
            return false;
        }
        
        // cast the Object compared to Book object
        // if the variables of both objects are same, both objects are same
        Book comparedBook = (Book) compared;
        return comparedBook.identifier.equals(this.identifier);  
    }
}

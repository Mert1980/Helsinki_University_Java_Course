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
    
    private String title;
    private int pages;
    private String publicationYear;
    
    public Book(String bookTitle, int totalPages, String publicationYear){
        this.title = bookTitle;
        this.pages = totalPages;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public String getYear(){
        return this.publicationYear;
    }
    
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.getYear();
    }
    
}

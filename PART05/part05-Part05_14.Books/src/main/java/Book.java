
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        // if the variables share the same address, they are equal
        if(this == compared){
            return true;
        }
        
         // if the compared object is not of type Book, the objects are not equal
        if(!(compared instanceof Book)){
            return false;
        }
        
        // cast the Object type comparison object
        // into a Book type comparisonBook object
        Book comparedBook = (Book) compared;
        return comparedBook.name.equals(this.name) && 
                comparedBook.publicationYear == this.publicationYear;
    }
}

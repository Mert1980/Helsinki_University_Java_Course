
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Book> bookList = new ArrayList<>();
        
        
        while(true){
            System.out.println("Indetifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if(identifier.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            Book book = new Book(identifier, name);
            
            if(!bookList.contains(book)){
                bookList.add(book);  
            }  
        }
        
        for(Book book:bookList){
            System.out.println(book.getIdentifier() + ": " + book.getName());
        }

    }
}

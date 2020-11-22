
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            // reading the file line by line
            Files.lines(Paths.get(file))
                    // splitting the row into parts on the "," character
                    .map(row -> row.split(","))
                    // creating books from the parts
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    // and finally add the book to the list
                    .forEach(book -> books.add(book));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }
}

// Alternative Solution
//public static List<Book> readBooks(String file) {
//        try {
//            return Files.lines(Paths.get(file))
//                    .map(line -> line.split(","))
//                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
//                    .collect(Collectors.toList());
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        
//        return new ArrayList<>();
//    }

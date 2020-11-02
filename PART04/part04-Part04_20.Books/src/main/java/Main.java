
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            String publicationYear = scanner.nextLine();

            books.add(new Book(title, pages, publicationYear));

        }

        System.out.print("What information will be printed? Everything or name? ");
        String preference = scanner.nextLine();

        switch (preference) {
            case "everything":
                for (Book book : books) {
                    System.out.println(book);
                }
                break;
            case "name":
                for (Book book : books) {
                    System.out.println(book.getTitle());
                }
                break;

        }
    }
}

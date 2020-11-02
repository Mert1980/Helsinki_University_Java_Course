
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = -1;
        String name = "";

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] parts = sentence.split(",");
            int age = Integer.valueOf(parts[1]);

            if (age > oldest) {
                oldest = age;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}

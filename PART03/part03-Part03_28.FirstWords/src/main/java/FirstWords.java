
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }
            
            String[] words = sentence.split(" ");
            System.out.println(words[0]);
        }
    }
}

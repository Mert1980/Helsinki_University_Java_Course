
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;

        while (counter <= number) {
            System.out.println(counter);
            counter++;
        }
    }
}

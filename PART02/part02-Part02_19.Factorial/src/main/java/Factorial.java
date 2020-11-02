
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number:");
        int number = scanner.nextInt();
        
        int factorial = 1;
        int counter = 1;
        
        while(counter <= number){
            factorial *= counter;
            counter++;
        }
        System.out.println("Factorial: " + factorial);
    }
}

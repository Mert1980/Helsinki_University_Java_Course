
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String text = scan.nextLine();
        
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        
         System.out.println("Give a double:");
         double floatingNumber = Double.valueOf(scan.nextLine());
         
        System.out.println("Give a boolean:");
        Boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        // Write your program here
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatingNumber);
        System.out.println("You gave the boolean " + trueOrFalse);

    }
}

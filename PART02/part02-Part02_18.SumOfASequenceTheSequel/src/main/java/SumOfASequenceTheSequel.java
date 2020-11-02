
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number?");
        int beginning = scanner.nextInt();
        
        System.out.print("Last number?");
        int end = scanner.nextInt();
              
        int sum = 0; 
        
        while(beginning <= end){       
            sum += beginning;
            beginning++;  
        }
        System.out.println("The sum is " + sum);

    }
}

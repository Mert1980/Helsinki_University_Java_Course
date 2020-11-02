
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
              
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        float average = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        
        while(true){
            int number = scanner.nextInt();
            
            if(number == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (number % 2 == 0 ){
                even++;
            } else {
                odd++;
            }
            
            counter++;
            sum += number;
            average = (float) sum / counter; 
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

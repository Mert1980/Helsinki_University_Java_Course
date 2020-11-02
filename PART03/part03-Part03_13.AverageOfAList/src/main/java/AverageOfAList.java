
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            list.add(number);
        }
        int sum = 0, counter = 0;
        for(Integer number:list){
            sum += number;
            counter++;
        }
        double average = (double)sum/counter;
        System.out.println("Average: " + average);
    }
}

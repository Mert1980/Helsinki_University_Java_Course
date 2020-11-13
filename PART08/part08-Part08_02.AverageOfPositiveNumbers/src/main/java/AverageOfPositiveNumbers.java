
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number > 0) {
                list.add(number);
            }
            
            if(number == 0){
                printAverage(list);
                break;
            }
        }
    }
    
    public static void printAverage(ArrayList<Integer> list){
        int sum = 0;
        for(int num:list){
            sum+=num;
        }
        if(list.isEmpty()){
            System.out.println("Cannot calculate the average");
            return;
        }
        System.out.println(1.0 * sum/list.size());
    } 
}

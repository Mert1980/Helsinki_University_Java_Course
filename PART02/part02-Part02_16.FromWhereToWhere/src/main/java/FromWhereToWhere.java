
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Where to?");
        int first = Integer.valueOf(scanner.next());
        
        System.out.print("Where from?");
        int second = Integer.valueOf(scanner.next());

        if(first >= second){
            for(int i = second; i <= first; i++){
                System.out.println(i);
            }
        }
    }
}

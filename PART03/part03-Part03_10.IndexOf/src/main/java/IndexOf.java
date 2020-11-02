
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
    //    ArrayList<Integer> indexList = new ArrayList<>(); 
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.print("Search for?");
        int number = Integer.valueOf(scanner.next());
    //    int index = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == number){
    //         indexList.add(i);
               System.out.println(number + " is at index " + i);
            }
        }
    //    for (int i = 0; i < indexList.size(); i++) {
    //        System.out.println(number + " is at index " + indexList.get(i));
    //    }
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning, end;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.print("From where?");
        beginning = Integer.valueOf(scanner.next());
        System.out.print("To where?");
        end = Integer.valueOf(scanner.next());

        for(int i = beginning ; i <= end; i++){
            System.out.println(numbers.get(i));
        }
    }
}

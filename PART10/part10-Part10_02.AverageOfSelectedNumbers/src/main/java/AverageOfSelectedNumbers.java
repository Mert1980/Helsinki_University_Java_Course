
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            numbers.add(Integer.valueOf(input));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String input = scanner.nextLine();
        double average;

        if (input.equalsIgnoreCase("n")) {
            average = numbers.stream().mapToInt(num -> num).filter(num -> num < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else {
            average = numbers.stream().mapToInt(num -> num).filter(num -> num > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}

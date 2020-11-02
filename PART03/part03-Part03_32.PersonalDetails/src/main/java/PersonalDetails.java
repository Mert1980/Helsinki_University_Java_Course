
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String longestName = "";
        int sumOfYears = 0;
        double averageOfBirthYears = 0;
        int counter = 0;

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] parts = sentence.split(",");
            
            int year = Integer.valueOf(parts[1]);
            sumOfYears += year;
            counter++;

            if(parts[0].length() > longestName.length()) {
                longestName = parts[0];
               
            }
        }
        averageOfBirthYears = (double) sumOfYears / counter;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageOfBirthYears);
    }
}

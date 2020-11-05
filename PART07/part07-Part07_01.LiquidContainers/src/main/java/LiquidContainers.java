
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContVol = 0;
        int secondContVol = 0;

        while (true) {

            System.out.println("First: " + firstContVol + "/100");
            System.out.println("Second: " + secondContVol + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
               
                firstContVol += amount;
                if (firstContVol > 100) {
                    firstContVol = 100;
                }
            }

            if (command.equals("move") && amount > 0) {
                
                if (amount > firstContVol) {
                    secondContVol += firstContVol;
                    firstContVol = 0;
                    continue;
                }

                firstContVol -= amount;
                secondContVol += amount;

                if (firstContVol < 0) {
                    firstContVol = 0;
                }

                if (secondContVol > 100) {
                    secondContVol = 100;
                }
            }

            if (command.equals("remove") && amount > 0) {
                secondContVol -= amount;
                 
                if (secondContVol < 0) {
                    secondContVol = 0;
                }
            }
        }
    }
}

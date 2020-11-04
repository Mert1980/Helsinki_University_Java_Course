
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI ui = new TextUI(scan, dictionary);
        ui.start();
        System.out.println(dictionary.translate("Car"));         
    }
}

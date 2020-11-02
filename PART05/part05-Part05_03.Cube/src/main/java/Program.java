
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of the cube: ");
        int length = scanner.nextInt();
        
        Cube cube = new Cube(length);
        
        System.out.println(cube);

        // Experiment with your program here
    }
}

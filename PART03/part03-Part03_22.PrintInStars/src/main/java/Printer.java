
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int value : array) {
            print(value);
            System.out.println("");
        }
    }
    
    public static void print(int numberOfStars){
        for (int i = 0; i < numberOfStars; i++) {
                System.out.print("*");
        }
    }
}

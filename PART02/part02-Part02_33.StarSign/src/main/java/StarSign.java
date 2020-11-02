
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(5);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        while(number > 0){
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int length = size;
        while(length > 0){
            printStars(size);
            length--;
        }
    }

    public static void printRectangle(int width, int height) {
        while(height > 0){
            printStars(width);
            height--;
        }
    }

    public static void printTriangle(int size) {
        int length = 1;
        while(size >= length){
            printStars(length);
            length++;
        }
    }
}

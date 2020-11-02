

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {6,2,8,1,3,0,9,7};
        
        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        
        int index = findIndex(searching, array);
        printIndex(searching, index);         
    }
    
    public static int findIndex(int value, int[] array){
        for (int i = 0; i < array.length; i++) {
            if(value == array[i]){
                return i;
            }   
        }
        return -1;
    }
    
    public static void printIndex(int value, int index){
        if(index == -1){
            System.out.println(value + " was not found.");
        } else {
            System.out.println(value + " is at index " + index + ".");
        } 
        
    }
}

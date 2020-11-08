
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

//        int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println(smallest(array));
//        System.out.println(indexOfSmallest(array));
//        System.out.println(indexOfSmallestFrom(array, 2));
//
//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallest);
        }
    }

    public static int smallest(int[] array) {

        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[indexOfSmallest]) {
                indexOfSmallest = i;
            }   
        }
       return indexOfSmallest; 
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}

package ch17pc01;
import static ch17pc01.ObjectInsertionSorter.*;

/**
 * 
 * @author frank
 */
public class Ch17pc01 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Create an array
        String[] stringArray = {"beta", "gamma", "alpha", "epsilon", "delta"};
        printStuff(stringArray, "Unsorted Array: ");
        
        insertionSort(stringArray);
        
        printStuff(stringArray, "Sorted Array: ");
    }
    
    /**
     * Method to print the individual elements of an array
     * @param array String[] The array to be printed
     * @param text String The type of array
     */
    public static void printStuff(String[] array, String text){
        // Print the original array
        System.out.println(text);
        for (String str: array) {
            System.out.println(str + " ");
        }
        System.out.println();
    }

}

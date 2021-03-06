package src.main.Java0;

/**
 * Created by byang on 2018-08-28.
 */

public class Generic1PMethod {
    // generic method printArray
   public static < E > void printArray( E[] inputArray ) {
       //  protected < E > void printArray(E[] inputArray) {//this will error that is called in static context
        // Display array elements
       System.out.println("format %s ");
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array
    }
}
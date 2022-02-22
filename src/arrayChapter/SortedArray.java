package arrayChapter;

import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        printArray(getIntegers(5));
    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values:\r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int [] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int [] initialArray) {
        int [] array = new int[initialArray.length];
        for(int i = 0; i < array.length; i++) {
            array[i] = initialArray[i];
        }
        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMax = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[indexOfMax] < array[j]) {
                    indexOfMax = j;
                }
            }
            if (indexOfMax != i) {
                int aux = array[indexOfMax];
                array[indexOfMax] = array[i];
                array[i] = aux;
            }

        }
        return array;
    }
}

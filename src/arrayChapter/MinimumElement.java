package arrayChapter;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        int [] array = readElements(readInteger());
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many elements you want to enter:\r");
        return scanner.nextInt();
    }

    private static int[] readElements(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[arrayLength];
        for (int i=0;  i < arrayLength; i++) {
            System.out.println("Enter array element number " + i + ":\r");
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int findMin(int[] array) {
        int minNumber = array[0];
        for (int j = 1; j < array.length; j++) {
            if (minNumber > array[j]) {
                minNumber = array[j];
            }
        }
        return minNumber;
    }
}

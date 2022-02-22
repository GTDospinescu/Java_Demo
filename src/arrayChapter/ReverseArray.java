package arrayChapter;

import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        int[] reversed = new int[array.length];
//        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
//            reversed[j++] = array[i];
            reversed[array.length - i - 1] = array[i];
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversed));
    }
}

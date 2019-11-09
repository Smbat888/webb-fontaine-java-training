package Week3;

import java.util.Arrays;

public class DoubleTheElements {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        doubleing(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void doubleing(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }
}

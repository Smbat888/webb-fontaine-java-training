package Week3;

import java.util.Arrays;

public class CombineTwoArraysAndAverage {
    public static void main(String[] args) {
        int first[] = {2, 6};
        int second[] = {3, 8};
        int com[] = new int[first.length + second.length];

        fillCom(first, second, com);
        System.out.println(Arrays.toString(com));
        System.out.println(avg((first)) + avg((second)));
        System.out.println(avg(com));
    }

    private static void fillCom(int[] array1, int[] array2, int[] array3) {
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length, j = 0; j < array2.length; i++, j++) {
            array3[i] = array2[j];
        }
    }

    private static double avg(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
        }
        return (double) x / array.length;
    }
}

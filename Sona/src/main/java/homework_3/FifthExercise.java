package main.java.homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class FifthExercise {

    public static void main(String args[]) {
        int[] array1 = typing1();
        int[] array2 = typing2();
        arrayAttach(array1, array2);
        average(array1, array2);
    }

    static int[] typing1() {

        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Please enter numbers for 1st array");
            array1[i] = scanner.nextInt();
        }
        return array1;
    }

    static int[] typing2() {

        Scanner scanner = new Scanner(System.in);
        int[] array2 = new int[3];

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Please enter numbers for 2nd array");
            array2[i] = scanner.nextInt();
        }
        return array2;
    }

    static void arrayAttach(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] array = new int[length];
        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2, 0, array, array1.length, array2.length);
        System.out.println("The array is" + Arrays.toString(array));
    }

    static void average(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            int number1 = array1[i];
            sum1 = sum1 + number1;
        }
        for (int i = 0; i < array2.length; i++) {
            int number2 = array1[i];
            sum2 = sum2 + number2;
        }
        double average = ((double) sum1 + sum2) / (array1.length + array2.length);
        System.out.println("The average is:" + average);
    }
}




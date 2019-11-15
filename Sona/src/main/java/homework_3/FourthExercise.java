package main.java.homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class FourthExercise {

    public static void main(String[] args) {
        String[] array = typing1();
        int number = typing2();
        sorting(array, number);
    }

    static String[] typing1() {

        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter something");
            array[i] = scan.next();
        }
        return array;
    }

    static int typing2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = scan.nextInt();
        return number;
    }

    static void sorting(String[] array, int number) {
        String[] array1 = new String[5];
        System.arraycopy(array, 0, array1, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > number) {
                array1[i] = array1[i].replace(array1[i], " ");
            }
        }
        System.out.println("The entered array is " + Arrays.toString(array));
        System.out.println("The sorted array is " + Arrays.toString(array1));
    }
}

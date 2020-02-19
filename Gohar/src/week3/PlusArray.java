package oop.week3;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class PlusArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int[] plusArray() {
        int[] array1 = {5, 5, 5};
        int[] array2 = {4, 4, 4};
        int[] plusArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; ++i) {
            plusArray[i] = array1[i];
            System.out.println(plusArray);
        }
        int matrix1Length = array1.length;
        for (int i = 0; i < array2.length; ++i) {
            plusArray[matrix1Length + i] = array2[i];
        }
        return plusArray;
    }
}


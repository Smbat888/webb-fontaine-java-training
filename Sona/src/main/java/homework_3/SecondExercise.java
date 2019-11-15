package main.java.homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class SecondExercise {

    public static void main(String args[]) {
        String[] array = typing();
        copy(array);
    }

    static String[] typing() {

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[11];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter something");
            array[i] = scanner.next();
        }
        return array;
    }

    static void copy(String[] array) {
        for (int i = 0; i < array.length; i++) {

            array[i] = array[i] + array[i] + array[i];
        }
        System.out.println(Arrays.toString(array));
    }
}


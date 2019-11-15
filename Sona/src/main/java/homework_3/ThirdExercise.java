package main.java.homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdExercise {

    public static void main(String args[]) {
        String[] array = typing();
        cheching(array);
    }

    static String[] typing() {
        Scanner scan = new Scanner(System.in);
        String array[] = new String[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter something");
            array[i] = scan.next();
        }
        return array;
    }

    static void cheching(String[] array) {
        String changedArray[] = new String[5];
        String typed;
        for (int i = 0; i < array.length; i++ ) {
            if (array[i].contains("a")) {
                typed = array[i];
                changedArray[i] = typed.replace("a", "");
            } else {
                typed = array[i];
                changedArray[i] = typed;
                System.out.println("The letter 'a' has not found for typing No:" + (i + 1));
            }
        }
        System.out.println("The typed array is:" + Arrays.toString(array));
        System.out.println("The changed array is:" + Arrays.toString(changedArray));
    }
}

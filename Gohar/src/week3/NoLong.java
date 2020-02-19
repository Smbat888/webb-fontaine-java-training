package oop.week3;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class NoLong {
    static Scanner scanner = new Scanner(System.in);
    static String[] array = {"aaaa", "gg", "oooo", "q"};

    public static void main(String[] args) {
        for (String s : noLonger(array, 4)) {
            System.out.println(s);
        }
    }

    public static String[] noLonger(String[] array, int maxLength) {
        int i = 0;

        String[] array2 = new String[array.length];

        for (int j = 0; j < array.length; ++j) {
            if (array[j].length() < maxLength) {
                array2[i] = array[j];
                ++i;
            }
        }

        String[] array3 = new String[i];
        for (int j = 0; j < i; j++) {
            array3[j] = array2[j];
        }
        return array3;
    }

}

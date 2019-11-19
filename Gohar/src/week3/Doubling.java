package week3;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class Doubling {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        doublingbytwo(array);
    }

    public static void doublingbytwo(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i] * 2;
            System.out.println(array2[i]);
        }
    }
}

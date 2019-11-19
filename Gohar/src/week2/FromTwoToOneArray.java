package week2;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class FromTwoToOneArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array1[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < array1.length; ++i) {
            for (int j = 0; j < array1[i].length; ++j) {
                System.out.println(array1[i][j]);
            }
        }
    }
}

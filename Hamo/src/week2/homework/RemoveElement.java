package week2.homework;

import java.util.Scanner;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class RemoveElement {
    static Scanner scanner = new Scanner(System.in);
    static int numbers[] = {1, 5, 4, 7, 8, 55, 1, 2, 3, 6, 5, 4};

    public static void main(String[] args) {
        removeElement(1);
    }

    public static void removeElement(int index) {
        int[] newArray = new int[numbers.length - 1];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != index) {
                newArray[j] = numbers[i];
                j++;
            }
        }
        for (int a : newArray
        ) {
            System.out.println(a);

        }
    }

}

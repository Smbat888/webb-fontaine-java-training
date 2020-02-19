package arrays;

import java.util.Scanner;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class IsNumberExists {
    static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.println("plese input number to check is Exists :");
        isExist(scanner.nextInt());
    }

    public static void isExist(int number) {
        int array[] = {1, 4, 8, 9, 5, 78, 9662, 14, 12, 15, 6, 65, 61, 85, 87, 54, 52};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == number) {
                System.out.println(array[i] + " exists!");
            }
        }
    }
}

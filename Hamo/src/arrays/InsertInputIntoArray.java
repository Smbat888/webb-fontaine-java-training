package arrays;

import java.util.Scanner;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class InsertInputIntoArray {
    static Scanner scanner = new Scanner(System.in);
    public static int arraySize;
    public static int test;

    public static void main(String[] args) {
        System.out.println(converIntIntoArray(scanner.nextInt()));

    }

    public static int understandArraySize(int input) {
        input = test;
        while (input != 0) {
            input /= 10;
            ++arraySize;
        }
        return arraySize;
    }

    public static int[] converIntIntoArray(int input) {
        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize - 1; i++) {
            array[i] = input / (int) (Math.pow(10, (arraySize - 1 - i)));
            input = input % (int) (Math.pow(10, (arraySize - 1 - i)));
        }
        return array;
    }
}

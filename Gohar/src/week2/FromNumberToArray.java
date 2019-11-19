package week2;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class FromNumberToArray {
    Scanner scanner = new Scanner(System.in);
    public static int arraySize;
    public static int numbers;

    public static void main(String[] args) {
        arraySize(66613);
        change();
    }

    public static void arraySize(int input) {
        input = numbers;
        while (input != 0) {
            input /= 10;
            ++arraySize;
        }
    }

    public static void change() {
        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize - 1; i++) {
            int temp = numbers % 10;
            array[arraySize - 1] = numbers % 10;
            --arraySize;
            System.out.println(temp);
        }
    }
}



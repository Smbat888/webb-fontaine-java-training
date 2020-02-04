package week2;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayFromNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static int firstnumber = scanner.nextInt();

    public static void main(String[] args) {
        castToArray();

    }

    public static void castToArray() {
        int length = 0;
        int k = 1;
        int number = firstnumber;
        while (number != 0) {
            number = number / 10;
            length++;
        }
        int myArray[] = new int[length];
        while (firstnumber > 0) {
            myArray[length - 1] = firstnumber % 10;
            firstnumber = firstnumber / 10;
            length--;

        }
        System.out.println(Arrays.toString(myArray));
    }


}

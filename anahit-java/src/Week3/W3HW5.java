package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class W3HW5 {
    public static void main(String[] args) {


        int[] array1 = getFirstArray();
        int[] array2 = getSecondArray();
        finalArray(array1, array2);
        average(array1, array2);

    }

    static void finalArray(int[] array1, int[] array2) {
    }


    static int[] getFirstArray() {

        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("numbers of the first array ");
            array1[i] = scanner.nextInt();
        }
        return array1;
    }

    static int[] getSecondArray() {

        Scanner scanner = new Scanner(System.in);
        int[] array2 = new int[3];

        for (int i = 0; i < array2.length; i++) {
            System.out.println("numbers of the 2nd array");
            array2[i] = scanner.nextInt();
        }
        return array2;
    }

    static void addTwoArrays(int[] array1, int[] array2) {
        int newArrayLength = array1.length + array2.length;

        int[] finalArray = new int[newArrayLength];

        System.arraycopy(array1, 0, finalArray, 0, array1.length);
        System.arraycopy(array2, 0, finalArray, array1.length, array2.length);
        System.out.println(" The final array is " + Arrays.toString(finalArray));


    }

    static void average(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            int number1 = array1[i];
            sum1 = sum1 + number1;
        }
        for (int i = 0; i < array2.length; i++) {
            int number2 = array1[i];
            sum2 = sum2 + number2;
        }
        double average = ((double) sum1 + sum2) / (array1.length + array2.length);
        System.out.println("The average of the arrays is : " + average);
    }


}

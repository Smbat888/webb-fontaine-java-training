package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class W3HW6 {
    public static void main(String[] args) {

        double[] myArray = getArrayElements();

        System.out.println(Arrays.toString(myArray));
        increaseIndexBy10Percent(myArray, 2);
        System.out.println(myArray[2]);


    }

    static double[] getArrayElements() {

        double[] myArray = new double[3];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {

            System.out.println("Please enter the elements of the array");
            myArray[i] = s.nextInt();
        }
        return myArray;
    }

    private static void increaseIndexBy10Percent(double[] array, int index) {

        array[index] = array[index] + array[index] * 0.1;

    }

}

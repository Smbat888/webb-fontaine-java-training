package week2;

import java.util.Scanner;

public class AverageOfDoubleArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of Double array");
        int length = sc.nextInt();
        double sum = 0;
        while (length <= 0) {

            System.out.println("Length of Double array should be greater than 0");
            System.out.println("Please enter length of Double array");
            length = sc.nextInt();
        }
        double[] array = new double[length];
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; ++i) {
            double userInput = sc.nextDouble();
            array[i] = userInput;
            sum += array[i];
        }
        System.out.println("The Average of this double arrays = " + sum / length);

    }

}


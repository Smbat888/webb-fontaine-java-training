package week2.homework;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class MediumNumber {
   static double sum = 0;
    static double[] array = {1, 2, 4, 5,  8, 9, 70, 1, 2, 3};

    public static void main(String[] args) {
        System.out.println(mediumSum(array));
    }

    private static double mediumSum(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
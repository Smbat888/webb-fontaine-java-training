package week4.aaa;

/**
 * Created by: Hmayak Atayan on 15 December, 2019
 */
public class AdjacentElement {
    public static void main(String[] args) {
        int mult = 0;

        int[] inputArray = {3, 6, -2, -5, 7, 3};
        try {
            for (int i = 0; i < inputArray.length; i++) {
                mult = inputArray[i] * inputArray[i + 1];
                for (int j = 1; j < inputArray.length; j++) {
                    if (mult < inputArray[j] * inputArray[j + 1]) {
                        mult = inputArray[j] * inputArray[j + 1];
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
        }
        System.out.println(mult);
    }
}
package arrays;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class MaxAndMin {
    static int min = 10;
    static int max = 10;
    static int numbers[] = {1, 2, 3, 4, 5, 88, 77, 908, 8};

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > min) {
                max = numbers[i];
            }
        }
        System.out.println("minimum is: " + min);
        System.out.println("maximum is: " + max);
    }

}

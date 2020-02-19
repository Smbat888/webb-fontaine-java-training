package conditions1;

import java.util.Scanner;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class CalculateFactorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculateFactorial(sc.nextInt());
    }

    public static void calculateFactorial(int i) {
        int d = 0;
        for (int j = 1; j <= i; j++) {
            d = j * i;
        }
        System.out.println(d);
    }
}

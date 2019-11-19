package week1;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */

public class IsPrime {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        experiment();
           }

    public static void experiment() {
        int sum = 0;
        for (int i = 3; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}

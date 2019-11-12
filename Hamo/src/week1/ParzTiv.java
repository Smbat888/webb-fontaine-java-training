package week1;

import java.util.Scanner;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class ParzTiv {
    public static void main(String[] args) {
        System.out.println("Type your number please: ");
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) != 0) {
            giveNextPrime(n);
        }
    }

    public static boolean isParz(int a) {
        boolean isNumberPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isNumberPrime = false;
            }
        }
        return isNumberPrime;
    }

    static void giveNextPrime(int n) {
        while (!isParz(n)) {
            n++;
        }
        System.out.println("The next prime number is: " + n);

    }
}

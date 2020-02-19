package conditions1.lessonone;

import java.util.Scanner;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Please type number:");
        System.out.println(isParz(sc.nextInt()));
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
}

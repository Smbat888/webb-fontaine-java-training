package conditions1;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class Factorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int factorial = calculateFactorial(sc.nextInt());
        System.out.println(factorial);
    }

    public static int calculateFactorial(int i) {
        int factorial = 1;
        for (int j = i; j > 0; j--) {
            factorial = factorial * j;
        }
        return factorial;
    }


}



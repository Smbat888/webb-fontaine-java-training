package conditions1;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class HashvelMijin {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a;
        double b;
        System.out.println("please insert a");
        a = scanner.nextDouble();
        System.out.println("please insert b");
        b = scanner.nextDouble();
        double c = 0;
        while (a < b - 1) {
            a++;
            c += a;
        }
        System.out.println(c);
    }

    public static void main(double a, double b) {
        System.out.println((a + b) / 2);

    }
}


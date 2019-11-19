package week1;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */

public class Cities {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a1;
        double b1;
        double a2;
        double b2;
        System.out.println("Insert a1");
        a1 = scanner.nextDouble();
        System.out.println("Insert b1");
        b1 = scanner.nextDouble();
        System.out.println("Insert a2");
        a2 = scanner.nextDouble();
        System.out.println("Insert b2");
        b2 = scanner.nextDouble();
        if (a1 >= a2 & b1 >= b2) {
            System.out.println(a1 - a2);
            System.out.println(b1 - b2);
            System.out.println("Mijankyal koordinatner");
            System.out.println((a1 - a2) / 2);
            System.out.println((b1 - b2) / 2);
        }
        else if (a1 <= a2 & b1 <= b2) {
            System.out.println(a2 - a1);
            System.out.println(b2 - b1);
            System.out.println("Mijankyal koordinatner");
            System.out.println((a1 - a2) / 2);
            System.out.println((b1 - b2) / 2);
        }
        else if (a1 <= a2 & b1 >= b2) {
            System.out.println(a2 - a1);
            System.out.println(b1 - b2);
            System.out.println("Mijankyal koordinatner");
            System.out.println((a1 - a2) / 2);
            System.out.println((b1 - b2) / 2);
        }
        else if (a1 >= a2 & b1 <= b2) {
            System.out.println(a1 - a2);
            System.out.println(b2 - b1);
            System.out.println("Mijankyal koordinatner");
            System.out.println((a1 - a2) / 2);
            System.out.println((b1 - b2) / 2);

        }

    }
}

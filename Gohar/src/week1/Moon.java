package week1;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on September
 */
public class Moon {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        moon(scanner.nextInt());
    }

    public static void moon(int a) {
        double i = 0.17;
        System.out.println(a + " * " + i + " = " + a * i);
    }
}


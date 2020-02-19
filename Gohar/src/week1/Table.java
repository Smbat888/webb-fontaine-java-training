package conditions1;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on September
 */
public class Table {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please type number of axyusak: ");
        table(scanner.nextInt());
    }

    public static void table(int a) {

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}

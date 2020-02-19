package conditions1;

import java.util.Scanner;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class Axyusak {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please type number for axyusak:");
        printAxyusak(scanner.nextInt());
    }
    public static void printAxyusak(int a){
        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * "+  i + " = " + a * i);
        }
    }
}

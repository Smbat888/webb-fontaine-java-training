package Week1;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number=");
        int num = input.nextInt();
        System.out.println("The Multiplication Table is:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "*" + (i) + "=" + (num * i));

        }
    }

}

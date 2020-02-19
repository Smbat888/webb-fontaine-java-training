package conditions1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class Calculate {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        calculate();
    }

    public static void calculate() throws IOException {
        double a;
        double b;
        char operator;
        System.out.println("Please enter a");
        a = scanner.nextDouble();
        System.out.println("Please enter b");
        b = scanner.nextDouble();
        System.out.println("Please enter operator");
        operator = (char) System.in.read();
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a * b);
                break;

            default:
                System.out.println("Please try again");
                calculate();
        }
    }
}

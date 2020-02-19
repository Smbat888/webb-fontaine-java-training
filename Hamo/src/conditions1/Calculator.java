package conditions1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        calculator();
    }

    public static void calculator() throws IOException {
        double firstNumber;
        char operation;
        double secondNumber;
        System.out.println("Please Enter First Number");
        firstNumber = scanner.nextDouble();
        System.out.println("Please Enter Second Number");
        secondNumber = scanner.nextDouble();
        System.out.println("Please Enter Operation");
        operation = (char) System.in.read();
        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
            break;

            case '-':
                System.out.println(firstNumber - secondNumber);
            break;

            case '*':
                System.out.println(firstNumber * secondNumber);
            break;

            case '/':
                System.out.println(firstNumber / secondNumber);
            break;

            default:
                System.out.println("incorrect input, please try again");
                calculator();
        }
    }

}

package conditions1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculator();

    }

    public static void calculator() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first number1:");
        float number1 = num.nextFloat();
        System.out.println("Enter second number2:");
        float number2 = num.nextFloat();
        System.out.println("Enter an operator:");
        char operator = num.next().charAt(0);
        float result = 0;
        switch (operator) {
            case ('+'):
                result = number1 + number2;
                break;
            case ('-'):
                result = number1 - number2;
                break;
            case ('*'):
                result = number1 * number2;
                break;
            case ('/'):
                if (number2 == 0) {
                    System.out.println(" The Number2 cannot be equal to 0 ");
                    return;
                } else
                    result = number1 / number2;
                break;
            default:
                System.out.println("Please try again,invalid input");
                return;
        }
        System.out.println(result);

    }
}

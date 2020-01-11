package Week1;
import java.util.Scanner;

public class N4_Operation {
    public static void main (String[] args) {

        Scanner num = new Scanner (System.in);
        System.out.print("Type first number: ");
        double first = num.nextDouble();

        System.out.print("Type an operation: ");
        String third = num.next();
        char operation = third.charAt(0);

        System.out.print("Type second number: ");
        double second = num.nextDouble();

        calculate(first, operation, second);

    }

    public static void calculate (double first, char operation, double second) {
        switch(operation) {
            case '+': System.out.print(first + "+" + second + "=" + (first + second));
                break;
            case '-': System.out.print(first + "-" + second + "=" + (first - second));
                break;
            case '*': System.out.print(first + "*" + second + "=" + (first * second));
                break;
            case '/': System.out.print(first + "/" + second + "=" + (first / second));
                break;
            default: System.out.print("Invalid input");
        }
    }
}

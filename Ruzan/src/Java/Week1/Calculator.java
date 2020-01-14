package Java.Week1;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1;
        int number2;
        int ans;
        int choose;
        String operation;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        number1 = input.nextInt();

        System.out.println("Please enter the second number: ");
        number2 = input.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("Please enter the operation: ");
        operation = op.next();

        choose = input.nextInt();

//        if (operation == "+");
//        {
//            System.out.println("The answer is: " + (number1 + number2));
//        }
//        if (operation == "-");
//        {
//            System.out.println("The answer is: " + (number1 - number2));
//        }
//        if (operation == "*");
//        {
//            System.out.println("The answer is: " + (number1 * number2));
//        }
//        if (operation == "/");
//        {
//            System.out.println("The answer is: " + (number1/number2));
//        }
//
//    }
//}

        choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println("The answer is: " + (number1 + number2));
                break;
            case 2:
                System.out.println("The answer is: " + (number1 - number2));
                break;
            case 3:
                System.out.println("The answer is: " + (number1 * number2));
                break;
            case 4:
                System.out.println("The answer is: " + (number1 / number2));
                break;
                default:
                System.out.println("Illegal Operation");

        }
    }
}

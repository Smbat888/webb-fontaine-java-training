package Java.Week1;

import java.util.Scanner;

public class Q2 {
    public static void main (String[] args) {

        double value1;
        double value2;
        char operatorType;
        double output;

        Scanner input = new Scanner(System.in);

        // Check if user actually enters numeric values for both values

        System.out.println("Please enter first number: ");
        if (!input.hasNextDouble()) {
            System.out.println("This is not a number! ");
        }
        value1 = input.nextDouble();

        System.out.println("Please enter second number: ");
        if (!input.hasNextDouble()) {
            System.out.println("This is not a number! ");
        }
        value2 = input.nextDouble();

        //Ask user to input what operation he wants to perform
        System.out.println("Please enter what operation you want to perform: (+, -, / or *) ");
        operatorType = input.next().charAt(0);

        if (operatorType == '+') {
            output = value1 + value2;
            System.out.println("Answer is: " + output);
        } else if (operatorType == '*'){
            output = value1 * value2;
            System.out.println("Answer is: " + output);
        } else if (operatorType == '/') {
            output = value1 / value2;
            if (value2 == 0) {
                System.out.println("You cannot divide numbers to 0! ");
            }
            System.out.println("Answer is: " + output);
        } else if (operatorType == '-') {
            output = value1 - value2;
            System.out.println("Answer is: " + output);
        }
        //Check if user entered what we asked from him and not wrong operation type
        else {
            System.out.println("You have entered invalid operation type! ");
        }
    }
}

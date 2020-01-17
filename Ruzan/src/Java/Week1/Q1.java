package Java.Week1;
import java.security.PublicKey;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number = 0;
        boolean isNumber;

        System.out.print("Enter the whole number: ");
        if (!input.hasNextDouble()) {
            System.out.println("Entered value type is not Double!");
        } else if (input.hasNextInt()) {
            System.out.println("Entered value type is not Double!");
        } else
            System.out.println("Entered value type is Double!");
    }
}
package Week1;

import java.util.Scanner;

public class CheckIfNumberIsDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number=");
        if (input.hasNextDouble()) {
            System.out.println("The Number is Double");
        } else {

            System.out.println("The Number is not double");
        }
    }
}

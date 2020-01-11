package Week1;

import java.util.Scanner;

public class N1_DoubleChecker {
    public static void main (String[] args) {

        Scanner num = new Scanner (System.in);
        System.out.print("Type a number: ");
        if(num.hasNextDouble()) {
            System.out.print("Found double.");
        }
        else {
            System.out.print("Not found double.");
        }
    }
}

// Why don't work?
/* public class doubleChecker {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Type a number: ");

        num.hasNextDouble()=true ? System.out.print("Type a number: "):System.out.print("Not found double.");

    }
} */
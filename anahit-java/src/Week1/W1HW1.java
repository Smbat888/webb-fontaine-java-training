package Week1;

import java.util.*;

public class W1HW1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("please enter a number");

        if (s.hasNextDouble()) {
            System.out.println("this is a double");
        }else {
            System.out.println("this is not a double");
        }

    }
}

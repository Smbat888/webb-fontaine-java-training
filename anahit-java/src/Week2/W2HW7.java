package Week2;

import java.util.Scanner;

public class W2HW7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        boolean isnumberinthelist = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);

        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = s.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) ;
            {
                isnumberinthelist = true;
            }
        }

        if ( true) {
            System.out.println("the number is on the list");

        } else {
            System.out.println("the number is not on the list");
        }
    }
}

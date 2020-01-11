package Week1;

import java.util.Scanner;

public class W1HW9 {

            public static void main(String args[]) {
                long n;
                int fact = 1;

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a number");

                n = sc.nextLong();

                for (int i = 1; i <= n; i++) {

                    fact = fact * i;

                }

                System.out.println("factorial is" + fact);

            }
        }




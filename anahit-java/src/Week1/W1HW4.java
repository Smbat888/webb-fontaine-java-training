package Week1;

import java.util.Scanner;

public class W1HW4 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("please enter an integer");
        int x = s.nextInt();

        System.out.println("please enter a double");
        double y = s.nextDouble();

        System.out.println("please enter an operator");
        char operator = s.next().charAt(0);

        switch (operator){
            case ('*'):
                System.out.println(x*y); break;
            case ('/'): if (y==0){
                System.out.println("can't divide to 0, please enter a different number");}
                else
                System.out.println(x/y);  break;
            case ('+'):
                System.out.println(x+y); break;
            case('-'):
                System.out.println(x-y); break;
            default:
                System.out.println("please enter a valid operator");

        }
    }
}

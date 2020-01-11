package Week1;

import java.util.Scanner;

public class W1HW2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("please enter a number");

        int x= s.nextInt();

        for(int i=1; i<=10; i++ ){
            System.out.println(x +" * " + i +" = " + (x*i));
        }
    }
}

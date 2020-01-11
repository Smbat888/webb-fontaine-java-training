package Week2;

import java.util.Scanner;

public class W2HW3 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("please enter a number");

        int x= s.nextInt();

        String[] str = Integer.toString(x).split("");

        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);





        }

    }
}

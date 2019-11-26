package Week1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class W1HW7 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        waitxseconds();
    }

    public static void waitxseconds() throws InterruptedException {
        int x;
        System.out.println("Please enter a number");
        x = s.nextInt();
        TimeUnit.SECONDS.sleep(x);
        System.out.println("DONE");

    }

}

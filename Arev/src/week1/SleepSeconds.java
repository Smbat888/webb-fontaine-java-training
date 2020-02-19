package conditions1;

import java.util.Scanner;

public class SleepSeconds {
    public static void main(String[] args) throws InterruptedException {
        Scanner time = new Scanner(System.in);
        System.out.println("Please enter a time: ");
        int seconds = time.nextInt();
        Thread.sleep(seconds);
        System.out.println("Sleep time in ms = " + seconds);

    }
}

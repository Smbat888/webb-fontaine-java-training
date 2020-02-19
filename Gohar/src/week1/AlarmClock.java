package conditions1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Gohar Farmanyan on October
 */
public class AlarmClock {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        alarmClock();
    }

    public static void alarmClock() throws InterruptedException {
        int a;
        System.out.println("Insert a");
        a = scanner.nextInt();
        TimeUnit.SECONDS.sleep(a);
        System.out.println("Finish");

    }

}

package conditions1;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class PrintAfterSeconds {
    //2000ms = 2Seconds
    public static void printText(String text, int miliseconds) throws InterruptedException {
        Thread.sleep(miliseconds);
        System.out.println(text);
    }

    public static void main(String[] args) throws InterruptedException {
        printText("hello", 10000);
    }
}

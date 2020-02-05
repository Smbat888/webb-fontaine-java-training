package multithreading.example;

/**
 * Created by: Hmayak Atayan on 25 January, 2020
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; ++i) {
            System.out.println("My Runnable:************** = " + i);
        }
    }
}

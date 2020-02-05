package multithreading.example;

/**
 * Created by: Hmayak Atayan on 25 January, 2020
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; ++i) {
            System.out.println("MyThread: i = " + i);
        }
    }
}

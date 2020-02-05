package multithreading.creatingThread;

/**
 * Created by: Hmayak Atayan on 23 January, 2020
 */
public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Tread nam is: " + Thread.currentThread().getName());
        try {
            for (int i = 5; i < 100; i += 5) {
                System.out.println(i);
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

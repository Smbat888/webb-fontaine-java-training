package multithreading.creatingThread;

/**
 * Created by: Hmayak Atayan on 23 January, 2020
 */
public class LearnThread extends Thread {
    @Override
   synchronized public void run() {
        System.out.println("Thread name is: " + Thread.currentThread().getName());

        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}

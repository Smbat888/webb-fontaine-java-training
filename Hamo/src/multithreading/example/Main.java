package multithreading.example;

/**
 * Created by: Hmayak Atayan on 25 January, 2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        System.out.println("starting MyThread");
        Thread t1 = new MyThread();
        t1.start();

        System.out.println("starting My Runnable");
        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);
        t2.start();

        t2.join();
        t1.join();

        System.out.println("Finishing");
    }
}

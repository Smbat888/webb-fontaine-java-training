package multithreading.creatingThread;

/**
 * Created by: Hmayak Atayan on 23 January, 2020
 */
public class Main {
    static private LearnThread thread = new LearnThread();
    static private MyRunnable runnable = new MyRunnable();
    static private Thread thread2 = new Thread(runnable);

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        thread.start();
        thread.join();
        thread2.start();

        exceptionalMethod();
    }

    public static void exceptionalMethod() {
        throw new RuntimeException();
    }

}

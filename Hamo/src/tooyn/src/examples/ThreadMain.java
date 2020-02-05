package tooyn.src.examples;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(" name:  " + Thread.currentThread().getName());
        System.out.println("starting MyThread ...");
        Thread t1 = new MyThread();
        t1.start();

        System.out.println("starting MuRunnable ...");
        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);
        t2.start();


        t2.join();
        t1.join();

        System.out.println("Finishing");
    }
}

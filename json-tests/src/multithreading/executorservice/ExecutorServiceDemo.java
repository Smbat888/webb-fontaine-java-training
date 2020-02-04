package multithreading.executorservice;

import java.util.Date;
import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

//        executorServiceExample();
//        callableExample();
//        schedulerExample();
//        schedulerAtFixedDelayExample();

        schedulerAtFixedRateExample();

    }

    private static void executorServiceExample() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });

        executorService.shutdown();
    }

    private static void callableExample() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new Callable<String>() {
            @Override
            public String call() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Asynchronous Callable");
                return "xxxxxxx";
            }
        });

        try {
            System.out.println("future.get() = " + future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void schedulerExample() {
        ScheduledExecutorService sch =
                Executors.newScheduledThreadPool(5);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable executes " +
                        Thread.currentThread().getName());
                Date date = new Date();
                System.out.println("end date " + date.toString());
            }
        };
        Date date = new Date();
        System.out.println("start date " + date.toString());
        sch.schedule(runnable, 7, TimeUnit.SECONDS);
        sch.schedule(new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                System.out.println("xxx date " + date.toString());
                System.out.println(" xxxxxxxxx: " +
                        Thread.currentThread().getName());
            }
        }, 7, TimeUnit.SECONDS);
    }

    private static void schedulerAtFixedDelayExample() {
        ScheduledExecutorService sch =
                Executors.newScheduledThreadPool(5);
        Date date = new Date();
        System.out.println("starting ******** " + date.toString());
        sch.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                System.out.println("******** " + date.toString());
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 2, 3, TimeUnit.SECONDS);
    }

    private static void schedulerAtFixedRateExample() {
        ScheduledExecutorService sch =
                Executors.newScheduledThreadPool(5);
        Date date = new Date();
        System.out.println("starting ******** " + date.toString());
        sch.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                System.out.println("******** " + date.toString());
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 1, 3, TimeUnit.SECONDS);
    }

}

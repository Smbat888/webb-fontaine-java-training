package runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeDemo {

    public static void main(String[] args) throws InterruptedException, IOException {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("total: " + runtime.totalMemory());
        System.out.println("free: " + runtime.freeMemory());


        for (int i = 0; i < 100000000; ++i) {
            new RuntimeDemo();
        }

        System.out.println("free: " + runtime.freeMemory());
        System.gc();
//        Thread.sleep(5000);
        System.out.println("free: " + runtime.freeMemory());

        // processes

        System.out.println("runtime.availableProcessors() = " + runtime.availableProcessors());

        runtime.exec("firefox");

    }
}

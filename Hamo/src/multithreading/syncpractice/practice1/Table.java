package multithreading.syncpractice.practice1;

/**
 * Created by: Hmayak Atayan on 23 January, 2020
 */
public class Table {
   synchronized void printTable(int n) {//method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
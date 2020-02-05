package multithreading.syncpractice.practice1;

/**
 * Created by: Hmayak Atayan on 23 January, 2020
 */
public class MyThread1 extends Thread {
    Table table;

    MyThread1(Table t) {
        this.table = t;
    }

    public void run() {
        table.printTable(5);
    }
}


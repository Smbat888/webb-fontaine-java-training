package multithreading.syncpractice.practice1;

/**
 * Created by: Hmayak Atayan on 23 January, 2020
 */
public class MyThread2 extends Thread {
    Table table;

    MyThread2(Table table) {
        this.table = table;
    }

    public void run() {
        table.printTable(100);
    }
}


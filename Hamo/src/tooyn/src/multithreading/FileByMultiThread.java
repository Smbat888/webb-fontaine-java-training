package tooyn.src.multithreading;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileByMultiThread {

    public static void main(String[] args) {
        String[] files = new File("/Users/smbat/Desktop").list();
        if (files ==  null) {
            return;
        }
        for (String file : files) {
            new Thread(new FileList("/Users/smbat/Desktop/" + file)).start();
        }

//        for (String file : files) {
//            readFile("/Users/smbat/Desktop/" + file);
//        }
    }

    private static void readFile(String fileLoc2) {
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Files.readAllLines(Paths.get(fileLoc2)).forEach(System.out::println);
        } catch (IOException e) {
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

/**
 * Comment filelist
 */
class FileList implements Runnable {

    private String fileLoc;

    FileList(String file) {
        this.fileLoc = file;
    }

    public void run() {
        readFile(fileLoc);
    }

    /**
     * reads file line by line
     *
     * @param fileLoc2 bla bla bla
     */
    private void readFile(String fileLoc2) {
        try {
            System.out.println(Thread.currentThread().getName());
            Files.readAllLines(Paths.get(fileLoc2)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
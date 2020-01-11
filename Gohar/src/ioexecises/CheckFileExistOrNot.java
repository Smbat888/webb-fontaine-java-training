package ioexecises;

import java.io.File;

public class CheckFileExistOrNot {
    public static void main(String a[]) {
        File my_file_dir = new File("C:/Users/Gohar Farmanyan/Desktop/doc.txt");
        if (my_file_dir.exists()) {
            System.out.println("The directory or file exists.");
        } else {
            System.out.println("The directory or file does not exists.");
        }
    }
}

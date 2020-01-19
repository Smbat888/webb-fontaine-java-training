package IO;

import java.io.*;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String a[]) {
        try {
            File input = new File("C:/Users/Agnesa Khachatryan/Desktop/file.txt");
            File output = new File("C:/Users/Agnesa Khachatryan/Desktop/file.txt");
            Scanner sc = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                printer.write(s);
            }
            printer.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
}

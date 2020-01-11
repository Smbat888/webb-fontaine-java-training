package ioexecises;

import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String args[]) {
        try {
            File input = new File("C:/Users/Gohar Farmanyan/Desktop/doc.txt");
            File output = new File("C:/Users/Gohar Farmanyan/Desktop/doc1.txt");
            Scanner sc = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                printer.write(s);
            }
            printer.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File not found. Please scan in new file.");
        }
    }
}

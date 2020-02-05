package io;

import java.io.*;

public class MyFileWriter {
    public static void main(String[] args) {
        writeIntoFile();
    }

    private static void writeIntoFile() {
        String content = "smth to write in file";

        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("example1.txt"))) {
            fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeIntoFile2() {
        String content = "smth to write in file2";

        try (FileWriter fileWriter = new FileWriter(new File("example2.txt"))) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeIntoFile4() {
//        String content = "smth to write in file3";
//        BufferedOutputStream bS = new BufferedOutputStream();
//        ByteArrayInputStream bAS = new ByteArrayOutputStream();
//


    }

    private static void writeIntoFile3() {
        Person person1 = new Person("John", "66");

    }
}

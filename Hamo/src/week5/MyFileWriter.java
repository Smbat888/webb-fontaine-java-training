package week5;

import java.io.*;

/**
 * Created by: Hmayak Atayan on 21 December, 2019
 */
public class MyFileWriter {
    public static void main(String[] args) {
        writeIntoFile();
        writeIntoFile2();
    }

    private static void writeIntoFile() {
        String content = "sth to write in file";
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("example.txt"));) {
            //todo FileOutputStream -> used for binary data

            fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeIntoFile2() {
        String content = "sth to write in file 222  \n test1  \n test2 \n test3  \n test4  \n test 5";
        try (java.io.FileWriter myFileWriter = new java.io.FileWriter("example 2.txt")) {
            //todo FileOutputStream -> used for binary data
            myFileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeIntoFile3() {
        Person person1 = new Person("John", 66);
        Person person2 = new Person("Smith", 77);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("myObjects.txt");
            ObjectOutputStream oS = new ObjectOutputStream(fileOutputStream);
            oS.writeObject(person1);
            oS.writeObject(person2);
        } catch (IOException e) {
        }
        try {
            FileInputStream is = new FileInputStream("myObjects.txt");
            ObjectInputStream oi = new ObjectInputStream(is);
            Person p1 = (Person) oi.readObject();
            Person p2 = (Person) oi.readObject();
            System.out.println("p1 = " + p1);
            System.out.println("p2 = " + p2);
        } catch (IOException e) {
            System.out.println("IO" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNot" + e.getMessage());
        }

    }
}

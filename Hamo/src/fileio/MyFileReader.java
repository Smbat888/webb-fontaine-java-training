package fileio;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by: Hmayak Atayan on 21 December, 2019
 */
public class MyFileReader {
    public static void main(String[] args) {
        System.out.println("readFile() = " + readFile());
    }

    private static String readFile() {

        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader("example.txt");) {
            int i;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}

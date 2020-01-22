package week6;

import java.io.IOException;

/**
 * Created by: Hmayak Atayan on 22 January, 2020
 */
public class FileReader {
    public static String readFile(String filePath) {

        StringBuilder sb = new StringBuilder();
        try (java.io.FileReader fileReader = new java.io.FileReader(filePath)) {
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


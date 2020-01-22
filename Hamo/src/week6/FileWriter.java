package week6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by: Hmayak Atayan on 22 January, 2020
 */
public class FileWriter {
    public static void writeIntoFile(String content, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));) {
            // FileOutputStream -> used for binary data
            fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

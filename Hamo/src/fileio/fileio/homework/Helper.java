package fileio.fileio.homework;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by: Hmayak Atayan on 24 December, 2019
 */
public class Helper {
    public static String readFile(String readerFilePath) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(readerFilePath);) {
            int i;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


    //        try (FileReader fileReader = new FileReader(filePath)) {
    //            int i;
    //            while ((i = fileReader.read()) != -1) {
    //                sb.append((char) i);
    //            }
    //        } catch (IOException e) {
    //            e.printStackTrace();
    //        }
    //        return sb.toString();
    //    }

    protected static void writeIntoFile(String writerFilePath, String content) {
        try (java.io.FileWriter myFileWriter = new java.io.FileWriter(writerFilePath)) {
            myFileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.println(element);
        }
    }
}

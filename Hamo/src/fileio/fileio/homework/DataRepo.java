package fileio.fileio.homework;

import java.io.*;

/**
 * Created by: Hmayak Atayan on 23 December, 2019
 */
public class DataRepo {

    public void isDirectory(File file, String path) {
        file = new File(path);
        System.out.println(file.isDirectory() ? "file is directory" : "file is not a directory");
    }

    public void isExist(String path) {
        File file = new File(path);
        //check is exists
        System.out.println(file.exists() ? "file  exists" : "file not exists");
    }

    public void canRead(String path) {
        File file = new File(path);
        //checks can ride or write
        System.out.println(file.canRead() ? "can read" : "can't read");
    }

    public void canWrite(String path) {
        File file = new File(path);
        System.out.println(file.canWrite() ? "can write" : "can't write");
    }

    public void getSizeBytes(String path) {
        File file = new File(path);
        //get size by bytes
        System.out.println(file.length() + "bytes");
    }

    public void getSizeByKiloBytes(String path) {
        //get size by kilobytes
        File file = new File(path);
        double kilobyte = ((double) file.length() / 1024);
        System.out.println(kilobyte + "kilobytes");
    }

    public void getSizeByMegaBytes(String path) {
        File file = new File(path);
        //get size by megabytes
        double megabyte = ((double) file.length() / 1024) / 1024;
        System.out.println(megabyte + "megabytes");
    }

    public void deleteFile(String path) {
        File file = new File(path);
        file.delete();
    }

    public void copyFile(String path, String txtFile, String fileDirectory) {
        try (FileInputStream fileInputStream = new FileInputStream(txtFile)) {
            {
                File file = new File(path);
                if (!file.exists()) file.mkdir();
                try (FileOutputStream outputStream = new FileOutputStream(fileDirectory)) {
                    byte[] bytes = new byte[fileInputStream.available()];
                    int lenght;

                    while ((lenght = fileInputStream.read(bytes)) != -1) {
                        outputStream.write(bytes, 0, lenght);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("output error ");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("input error");
        }
    }


    public void printAllDirectories(String path) {
        File file = new File(path);
        String[] content = file.list();
        Helper.printArray(content);
    }

    public void getFileFormat(String directory, String fileFormat) {
        File file = new File(directory);
        String[] listOfFiles = file.list();
        String[] filesByExtension = new String[listOfFiles.length];
        assert listOfFiles != null;
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].toLowerCase().endsWith(fileFormat)) {
                filesByExtension[i] = listOfFiles[i];
                Helper.printArray(filesByExtension);
            }
        }

    }

    public static String[] storeContentLineByLine(String fileName) {
        return Helper.readFile(fileName).split("\\r?\\n");
    }

    public void countLines(String fileName) {
        System.out.println(storeContentLineByLine(fileName).length);
    }

    public void readThenWriteIntoAnotherFile(String readerFilePath, String newFileName) {
        Helper.readFile(readerFilePath);
        Helper.writeIntoFile(newFileName, Helper.readFile(readerFilePath));
    }


}

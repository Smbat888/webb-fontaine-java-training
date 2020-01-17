package Week5.File_IO;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class GetFileList {
    public static void main(String[] args) throws IOException {
        //get files name,path and size list
        File directoryFile = new File("C:\\Users\\Lilia Shamirian\\Desktop\\File");
        File fileList[] = directoryFile.listFiles();
        for (File file : fileList) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Size :" + file.getTotalSpace());
            System.out.println(" ");
        }
        //get specific file extension list
        FilenameFilter jpgFilter;
        jpgFilter = (directoryFile1, name) -> name.endsWith(".jpg");
        String filesNameFilter[] = directoryFile.list(jpgFilter);
        for (String file : filesNameFilter) {
            System.out.println(file);
        }
    }
}

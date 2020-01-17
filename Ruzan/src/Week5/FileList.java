package Week5;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;

public class FileList {

    static String desktopPath = "C:\\Users\\Ruzan Sharkhatunyan\\Desktop";

    public static void main(String[] args) throws IOException {
        //Ex.1
        File dir = new File(desktopPath);
        File[] fileList = dir.listFiles();
        for (File file : fileList) {
            System.out.println("Program Files: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Space:" + file.getTotalSpace());

        }
        //Ex. 2
        FilenameFilter pdfFilter;
        pdfFilter = (file1, name) -> name.endsWith(".pdf");
        Collections directoryFile;
        String[] fileNameFilter = dir.list(pdfFilter);
        for (String file : fileNameFilter) {
            System.out.println(file);
        }

    }
}

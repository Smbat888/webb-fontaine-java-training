package Week5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Exists {
    static String desktopPath = "C:\\Users\\Ruzan Sharkhatunyan\\Desktop";

    public static void main(String[] args) throws IOException {
        File file = new File(desktopPath);

        if (file.exists()) {

            FileReader fr = new FileReader(file);
            LineNumberReader lnr = new LineNumberReader(fr);

            int linenumber = 0;

            while (lnr.readLine() != null) {
                linenumber++;
            }

            System.out.println("Number of lines : " + linenumber);

        }
        else {
            System.out.println("The fil does not exist.");
        }
    }
}

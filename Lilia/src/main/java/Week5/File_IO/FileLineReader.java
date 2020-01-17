package Week5.File_IO;

import Week4.Point_And_Line.Line;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileLineReader {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\Lilia Shamirian\\Desktop\\File\\Line.txt");

        if(file.exists()){

            FileReader fr = new FileReader(file);
            LineNumberReader lnr = new LineNumberReader(fr);

            int linenumber = 0;

            while (lnr.readLine() != null){
                linenumber++;
            }

            System.out.println("Total number of lines : " + linenumber);

        }else{
            System.out.println("File does not exists!");
        }
    }
}

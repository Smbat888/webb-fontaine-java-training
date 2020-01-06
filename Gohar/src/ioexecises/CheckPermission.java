package ioexecises;

import java.io.File;

public class CheckPermission {
    public static void main(String a[]) {
        File my_file_dir = new File("C:/Users/Gohar Farmanyan/Desktop/doc.txt");
        if (my_file_dir.canWrite())
        {
            System.out.println(my_file_dir.getAbsolutePath() + " can write.");
        }
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.");
        }
        if (my_file_dir.canRead())
        {
            System.out.println(my_file_dir.getAbsolutePath() + " can read.");
        }
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.");
        }
    }
}

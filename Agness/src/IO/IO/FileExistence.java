package IO;

import java.io.File;

public class FileExistence {
    public static void main(String a[]) {
        File txtFile = new File("C:/Users/Agnesa Khachatryan/Desktop/file.txt");
        if (txtFile.exists()) {
            System.out.println("Exists");
        } else {
            System.out.println("Doesn't exist");
        }
    }
}

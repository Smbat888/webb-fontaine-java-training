package IO;

import java.io.File;

public class ReadWritePermission {
    public static void main(String a[]) {
        File txtFile = new File("C:/Users/Agnesa Khachatryan/Desktop/file.txt");
        if (txtFile.canWrite()) {
            System.out.println(txtFile.getAbsolutePath() + " can write.");
        } else {
            System.out.println(txtFile.getAbsolutePath() + " can't write.");
        }
        if (txtFile.canRead()) {
            System.out.println(txtFile.getAbsolutePath() + " can read.");
        } else {
            System.out.println(txtFile.getAbsolutePath() + " can't read.");
        }
    }
}

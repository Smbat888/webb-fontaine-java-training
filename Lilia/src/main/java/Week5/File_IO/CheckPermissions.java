package Week5.File_IO;

import java.io.File;

public class CheckPermissions {
    public static void main(String[] args) {
        final File tempFile = new File("C:\\Users\\Lilia Shamirian\\Desktop\\File\\doc1.docx");
        if (tempFile.exists()){
            System.out.println("Exists");
        }else{
            System.out.println("Doesn't Exist");
        }
        if (tempFile.canRead()){
            System.out.println("Readable");
        }else{
            System.out.println("Not readable");
        }
        if (tempFile.canWrite()){
            System.out.println("Writable");
        }else{
            System.out.println("Not writable");
        }
    }
}

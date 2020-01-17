package Week5.File_IO;

import java.io.File;

public class GetFileSize {
    public static void main(String[] args) {
        final File file = new File("C:\\Users\\Lilia Shamirian\\Desktop\\File\\doc1.docx");
        if (file.exists()){
            System.out.println(bytes(file));
            System.out.println(kiloBytes(file));
            System.out.println(megaBytes(file));
        }
    }

    private static String bytes(File file) {
        return (double) file.length() + " bytes";
    }
    private static String kiloBytes(File file) {
        return (double) file.length()/1024 + " KB";
    }
    private static String megaBytes(File file) {
        return (double) file.length()/(1024*1024) + " MB";
    }
}

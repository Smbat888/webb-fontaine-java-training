package IO;

import java.io.File;

public class FileSize {
    public static void main(String a[]) {
        File file = new File("C:/Users/Agnesa Khachatryan/Desktop/file.txt");
        if (file.exists()) {
            System.out.println(bytes(file));
            System.out.println(kilobytes(file));
            System.out.println(megabytes(file));
        } else
            System.out.println("Doesn't exist");
    }

    private static String bytes(File file) {

        return file.length() + " bytes";
    }

    private static String kilobytes(File file) {

        return (double) file.length() / 1024 + " kb";
    }

    private static String megabytes(File file) {

        return (double) file.length() / (1024 * 1024) + " mb";
    }
}

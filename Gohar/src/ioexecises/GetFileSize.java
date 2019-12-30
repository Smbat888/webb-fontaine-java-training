package ioexecises;

import java.io.File;

public class GetFileSize {
    public static void main(String a[]) {
        File file = new File("C:/Users/Gohar Farmanyan/Desktop/smart board/");
        if(file.exists()){
            System.out.println(filesize_in_Bytes(file));
            System.out.println(filesize_in_kiloBytes(file));
            System.out.println(filesize_in_megaBytes(file));
        }
        else
            System.out.println("File does not exist");
    }
    private static String filesize_in_megaBytes(File file){
        return (double) file.length()/(1024*1024)+" mb";
    }
    private static String filesize_in_kiloBytes(File file){
        return (double) file.length()/1024+" kb";
    }
    private static String filesize_in_Bytes(File file){
        return file.length() +" bytes";
    }
}

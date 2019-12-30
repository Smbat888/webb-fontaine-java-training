package ioexecises;

import java.io.File;

public class GetFileName {
    public static void main(String a[]) {
        File file = new File("C:/Users/Gohar Farmanyan/Desktop/smart board/");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}

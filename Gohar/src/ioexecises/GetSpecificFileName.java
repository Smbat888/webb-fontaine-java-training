package ioexecises;

import java.io.File;
import java.io.FilenameFilter;

public class GetSpecificFileName {
    public static void main(String a[]) {
        File file = new File("C:/Users/Gohar Farmanyan/Desktop/smart board/");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".png")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}

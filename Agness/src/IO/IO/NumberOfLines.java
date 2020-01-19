package IO;

import java.io.*;

public class NumberOfLines {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:/Users/Agnesa Khachatryan/Desktop/file.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(file));
        int count = 0;
        while ((reader.readLine()) != null) {
            count++;
        }
    }
}

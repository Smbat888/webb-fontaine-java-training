package tooyn.src.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) throws IOException {
        FileInputStream input1=new FileInputStream("myObjects.txt");
        FileInputStream input2=new FileInputStream("samplefile1.txt");
        FileInputStream input3=new FileInputStream("samplefile7.txt");

        List<InputStream> fruits = new ArrayList<>();
        fruits.add(input1);
        fruits.add(input2);
        fruits.add(input3);
        Enumeration<InputStream> fruitEnumeration = Collections.enumeration(fruits);
        SequenceInputStream inst=new SequenceInputStream(fruitEnumeration);
        int j;
        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}

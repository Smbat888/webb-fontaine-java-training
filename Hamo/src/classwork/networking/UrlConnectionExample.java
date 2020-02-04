package classwork.networking;

import java.net.*;
import java.io.*;

/**
 * Created by: Hmayak Atayan on 14 January, 2020
 */
public class UrlConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");

            URLConnection urlcon = url.openConnection();

            InputStream stream = urlcon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}

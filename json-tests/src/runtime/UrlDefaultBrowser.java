package runtime;

import java.awt.Desktop;
import java.net.URL;
import java.util.Scanner;


/**
 Program to open input url in system Default browser
 in windows (input url from command prompt)
 @author includehelp
 */
public class UrlDefaultBrowser {
    public static void main(String[] args) {
        try{
            Scanner sc  =   new Scanner(System.in);
            System.out.println("Enter url (http://www.xyz.com) format  : ");
            String url =   sc.next();
            Desktop.getDesktop().browse(new URL(url).toURI());
        }
        catch(Exception E){
            System.err.println("Exp : "+E.getMessage());
        }

    }
}
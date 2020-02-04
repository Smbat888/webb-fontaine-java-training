package networking.socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSingle {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();//establishes connection


            DataInputStream dis = null;
            while (true) {

                dis = new DataInputStream(s.getInputStream());

                String str = (String) dis.readUTF();
                System.out.println("message= " + str);


            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

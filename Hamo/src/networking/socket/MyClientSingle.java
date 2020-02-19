package networking.socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClientSingle {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("Hello Server");
            dout.flush();

            dout.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
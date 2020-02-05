package classworkForNetworking;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImage {
    public static void main(String[] args) throws IOException {
        URL server =
                new URL("http://www.freeimageslive.com/galleries/objects/general/pics/woodenbox0482.jpg");
        HttpURLConnection connection = (HttpURLConnection) server.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        InputStream is = connection.getInputStream();
        OutputStream os = new FileOutputStream("WAllet_main.jpg");
        byte[] buffer = new byte[1024];
        int byteReaded = is.read(buffer);
        while (byteReaded != -1) {
            os.write(buffer, 0, byteReaded);
            byteReaded = is.read(buffer);
        }
        os.close();
    }
}

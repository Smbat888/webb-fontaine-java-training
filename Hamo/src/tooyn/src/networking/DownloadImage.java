package tooyn.src.networking;

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

//        connection.setDoInput(true);
//        connection.setDoOutput(true);
//        connection.setUseCaches(false);
//        connection.addRequestProperty("Accept", "image/gif, image/x-xbitmap, image/jpeg, image/pjpeg, application/msword, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/x-shockwave-flash, */*");
//        connection.addRequestProperty("Accept-Language", "en-us,zh-cn;q=0.5");
//        connection.addRequestProperty("Accept-Encoding", "gzip, deflate");
//        connection.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0; .NET CLR 2.0.50727; MS-RTC LM 8)");

        connection.connect();

        InputStream is = connection.getInputStream();

        OutputStream os = new FileOutputStream("Wallet_main.jpg");

        byte[] buffer = new byte[1024];
        int byteReaded = is.read(buffer);
        while (byteReaded != -1) {
            os.write(buffer, 0, byteReaded);
            byteReaded = is.read(buffer);
        }

        os.close();
        is.close();
    }
}

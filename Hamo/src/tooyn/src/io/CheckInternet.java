package tooyn.src.io;

import java.net.HttpURLConnection;
import java.net.URL;

public class CheckInternet {

    public static void main(String nix[]) {
        try {
            int timeOutInMilliSec = 5000;// 5 Seconds
            URL url = new URL("http://www.redhat.com/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            conn.setConnectTimeout(timeOutInMilliSec);
            conn.setReadTimeout(timeOutInMilliSec);
            int responseCode = conn.getResponseCode();
            if (200 <= responseCode && responseCode <= 399) {
                System.out.println("Internet is Available");
            }
        } catch (Exception ex) {
            System.out.println("No Connectivity");
        }
    }
}

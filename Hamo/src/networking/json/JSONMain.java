package networking.json;

import org.json.JSONObject;
import io.ReadFile;

public class JSONMain {

    public static void main(String[] args) {
        try {
            JSONObject jsonObject =
                    new JSONObject(ReadFile.readAllBytesJava7("samplefile1.txt"));

            JSONObject social = jsonObject.getJSONObject("social");
            System.out.println(" blog:  " + jsonObject.get("blogURL"));
            System.out.println(" rss:  " + social.get("rss"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

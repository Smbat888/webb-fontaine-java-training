package getjsonfromtheinternet;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by: Hmayak Atayan on 20 January, 2020
 */
public class PropertyFilePath {

    public static String getUrl() {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader("Hamo/resource/urlForHamo.properties")) {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("url");
    }
}

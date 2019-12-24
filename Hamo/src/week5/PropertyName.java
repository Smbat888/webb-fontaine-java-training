package week5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by: Hmayak Atayan on 21 December, 2019
 */
public class PropertyName {
    public static void main(String[] args) {
//        store();
        load();
    }

    private static void store() {
        Properties properties = new Properties();
        properties.setProperty("db", "mydb");
        properties.setProperty("host", "192.168.45.6");
        properties.setProperty("port", "8000");
                                    //"C:/Users/Hmayak/Desktop/props.properties"
        try (FileWriter fileWriter = new FileWriter("props.properties")) {
            properties.store(fileWriter, "the server machine configs");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void load() {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader("props.properties")) {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

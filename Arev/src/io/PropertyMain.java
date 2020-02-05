package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {
    public static void main(String[] args) {
//        store();
        load();
    }

    private static void store() {
        Properties properties = new Properties();
        properties.setProperty("db", "my-db");
        properties.setProperty("host", "192.168.45.6");
        properties.setProperty("port", "3000");

        try (FileWriter fileWriter = new FileWriter("props.properties")) {
            properties.store(fileWriter, "the server configs");

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
        System.out.println("properties = " + properties.getProperty("port"));
    }
}


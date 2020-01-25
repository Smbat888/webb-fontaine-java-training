package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {

    public static void main(String[] args) {
        System.out.println("args = " + args);

        Properties properties = new Properties();

        properties.setProperty("property1", "value1");
        properties.setProperty("property2", "value2");
        properties.setProperty("property3", "value3");

        try(FileWriter output = new FileWriter("props.properties")){
            properties.store(output, "These are properties");
        } catch (IOException e) {
            e.printStackTrace();
        }

        load();

    }

    public static void load() {
        Properties properties = new Properties();

        try(FileReader fileReader = new FileReader("props.properties")){
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("properties = " + properties);
    }

}

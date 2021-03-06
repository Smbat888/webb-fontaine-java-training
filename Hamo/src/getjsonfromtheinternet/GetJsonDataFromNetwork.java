package getjsonfromtheinternet;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * Created by: Hmayak Atayan on 20 January, 2020
 * * Get json from the internet. +
 * * Save it in local file. +
 * * Each time when program starts: check the internet availability(online/offline) +
 * * Read json from cache (saved local file) when offline and get from the internet when online (also, save again in the same local file).+
 * * Convert the json array/object to Java models and print (GSON) +
 * * the url should be used from property file +
 */
public class GetJsonDataFromNetwork {
    private static String json;
    private static String jsonFilePath = "Hamo/resource/jsonForHamo.json";

    public static void main(String[] args) {
        jsonFromNetwork();

        FileWriter.writeIntoFile(json, jsonFilePath);

        initObjectsAsParameterFromJson();
    }

    private static void jsonFromNetwork() {
        try {
            URL url = new URL(PropertyFilePath.getUrl());

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();

            InputStream inputStream = connection.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            StringBuilder sb = new StringBuilder();
            int output = -1;

            while ((output = reader.read()) != -1) {
                sb.append((char) output);
            }

            json = sb.toString();

        } catch (UnknownHostException internetChka) {
            json = FileReader.readFile(jsonFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initObjectsAsParameterFromJson() {
        Gson gson = new Gson();
        User[] users = gson.fromJson(json, User[].class);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
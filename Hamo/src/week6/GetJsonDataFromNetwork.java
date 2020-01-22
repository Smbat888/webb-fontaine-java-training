package week6;

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
 * * Convert the json array/object to Java models and print (GSON) -------
 * * the url should be used from property file +
 */
public class GetJsonDataFromNetwork {
    private static String json;
    private static String jsonFilePath = "Hamo/resource/jsonForHamo.txt";

    public static void main(String[] args) {
        jsonFromNetwork();

        FileWriter.writeIntoFile(json, jsonFilePath);
    }

    public static void ping() {
        try {
            URL url = new URL(PropertyFilePath.get());

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void jsonFromNetwork() {
        try {
            URL url = new URL(PropertyFilePath.get());

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
            FileReader.readFile(jsonFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //todo check this part
//
//            System.out.println("json = " + json);
////
////            JSONArray jsonArray = new JSONArray(json);
////            for (int i = 0; i < jsonArray.length(); ++i) {
////                JSONObject jsonUser = jsonArray.getJSONObject(i);
////
////                Gson gson = new Gson();
////                UsersArray user = gson.fromJson(json, UsersArray.class);
////                System.out.println("======================");
////            }
}

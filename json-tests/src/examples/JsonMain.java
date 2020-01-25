package examples;

import examples.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonMain {

    public static void main(String[] args) {

        jsonFromNetwork();

    }

    private static void jsonFromNetwork() {

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/todos");

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

            String json = sb.toString();

            System.out.println("json = " + json);


            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); ++i) {
                JSONObject jsonUser = jsonArray.getJSONObject(i);

                User user = new User();
                user.id = jsonUser.getInt("id");
                user.userId = jsonUser.getInt("userId");
                user.title = jsonUser.getString("title");
                user.completed = jsonUser.getBoolean("completed");

            }

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

    }

    private static void jsonFromFile() {
        try(FileReader fileReader = new FileReader("persons.json")) {

            StringBuilder sb = new StringBuilder();
            int output = -1;
            while ((output = fileReader.read()) != -1) {
                sb.append((char) output);
            }

            JSONObject jsonObject = new JSONObject(sb.toString());

            String name = jsonObject.getString("name");
            System.out.println("name = " + name);
            Integer age = jsonObject.getInt("age");
            System.out.println("age = " + age);
            JSONArray companies = jsonObject.getJSONArray("company");

            for (int i = 0; i < companies.length(); ++i) {
                JSONObject company = companies.getJSONObject(i);

                String companyName = company.getString("name");
                System.out.println("companyName = " + companyName);
                String address = company.getString("address");
                System.out.println("address = " + address);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void jsonfromString() {
        String jsonString = "{\"name\": \"Arshak\", \"age\": 26}";

        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            String name = jsonObject.getString("name");
            Integer age = jsonObject.getInt("age");

            System.out.println("name = " + name);
            System.out.println("age = " + age);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

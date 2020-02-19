package multithreading.examples;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MyCallbackThread implements Runnable {

    private MyCallback callback;
    private List<User> users = new ArrayList<>();

    public MyCallbackThread(MyCallback callback) {
        this.callback = callback;
    }

    @Override
    public void run() {

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

                users.add(user);
            }

            if (callback != null) {
                callback.onResponse(users);
            }

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}

interface MyCallback {
    void onResponse(List<User> users);
    void onFinish(String filepath);
}

package tooyn.src.networking.json;

import com.google.gson.Gson;

public class GsonMain {

    public static void main(String[] args) {
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";

        Gson gson = new Gson();

        Car car = gson.fromJson(json, Car.class);


        System.out.println("car.brand = " + car.model);
//        System.out.println("car.doors = " + car.doors);

    }
}

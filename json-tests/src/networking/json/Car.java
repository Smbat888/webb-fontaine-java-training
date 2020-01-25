package networking.json;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car {

    @SerializedName("brand")
    public String model;

    @SerializedName("doors")
    @Expose
    public Integer doors;
}

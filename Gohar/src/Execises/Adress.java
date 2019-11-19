package Execises;

public class Adress {

    private String country;
    private String city;
    private String adress;
    private int zipCode;

    public Adress(String country, String city, String adress, int zipCode) {
        this.country = country;
        this.city = city;
        this.adress = adress;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return String.format("{%s ,%s, %s, %d}", country, city, adress, zipCode);
    }
}

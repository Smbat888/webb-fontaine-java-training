package week4.tooyn;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Address {
    private String country;
    private String city;
    private String address;
    private int zipCode;

    public String getCountry() {
        return country;
    }

    public Address(String country, String city, String address, int zipCode) {
        this.country = country;
        this.city = city;
        this.address = address;
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public int getZipCode() {
        return zipCode;
        }

    @Override
    public String toString() {
        return String.format(" %s, %s, %s, %d",country,city,address,zipCode);
    }
}

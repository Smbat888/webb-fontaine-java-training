package week4.tooyn;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Company {
    private String name;
    private Address address;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, address);
    }

}

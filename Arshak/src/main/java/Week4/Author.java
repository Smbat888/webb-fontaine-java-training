package Week4;


public class Author {
    private String anun;
    private String azganun;
    private String nationality;


    public Author(String anun, String azganun, String nationality) {
        this.anun = anun;
        this.azganun = azganun;
        this.nationality = nationality;
    }


    public String getAnun() {
        return anun;
    }

    public void setAnun(String anun) {
        this.anun = anun;
    }

    public String getAzganun() {
        return azganun;
    }

    public void setAzganun(String azganun) {
        this.azganun = azganun;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return String.format("anun = %s, azganun = %s,natianality = %s", getAnun(), getAzganun(), getNationality());
    }
}
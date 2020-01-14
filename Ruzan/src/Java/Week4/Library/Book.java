package Java.Week4.Library;

public class Book {
    private int year;
    private int popularity;
    private String name;
    private Author author;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }



    public Book(int year, int popularity, String name, Author author) {
        this.year = year;
        this.popularity = popularity;
        this.name = name;
        this.author = author;
    }

    public Book(String bookName, int popularity) {
        this.name = bookName;
        this.popularity = popularity;
    }
}


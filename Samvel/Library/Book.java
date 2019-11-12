import java.time.LocalDate;

public class Book {
    private String title;
    private Author author;
    private double netWorth;
    private LocalDate releaseDate;

    public void setBook(String title, Author author, double netWorth, LocalDate releaseDate) {
        this.title = title;
        this.author = author;
        this.netWorth = netWorth;
        this.releaseDate = releaseDate;
    }

    public Author getBookAuthor() {
        return this.author;
    }

    public double getBookNetWorth() {
        return this.netWorth;
    }

    public String toString(){
        return String.format("{ title: %s, author: %s, networth: %s, releasedate: %s}", title, author, netWorth, releaseDate);
    }

    public static void bookArrayToString(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
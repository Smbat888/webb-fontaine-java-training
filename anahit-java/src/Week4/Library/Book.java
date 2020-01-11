import java.time.LocalDate;

public class Book {
    private String title;
    private Author author;
    private LocalDate date;
    private Float rating;

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Float getRating() {
        return rating;
    }

    public Book(String title, Author author, LocalDate date, Float rating) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("{ title: %s,author: %s, rating: %.2f, }", title, author.toString(), rating);
    }
}



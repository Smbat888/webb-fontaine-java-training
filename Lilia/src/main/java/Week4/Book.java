package Week4;

import java.time.LocalDate;

public class Book {
    private String title;
    private Author author;
    private LocalDate releaseDate;
    private String category;
    private Float rating;

    public Book(String title, Author author, LocalDate releaseDate, String category, Float price) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.category = category;
        this.rating = price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("{ title: %s,author: %s, release date: %s, rating: %.2f,category: %s }", title, author.toString(), releaseDate, rating, category);
    }
}

package week4.library;

public class Book {

    private Author author;
    private String title;
    private int pages;

    public Book(Author author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

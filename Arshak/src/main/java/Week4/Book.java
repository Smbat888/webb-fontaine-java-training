package Week4;

public class Book {

    private String vernagir;
    private int pages;
    private Author author;


    public Book(String vernagir, int pages, Author author) {
        this.vernagir = vernagir;
        this.pages = pages;
        this.author = author;
    }

    public String getVernagir() {
        return vernagir;
    }

    public void setVernagir(String vernagir) {
        this.vernagir = vernagir;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("vernagir = %s, pages = %d,Author = %s", getVernagir(), getPages(), getAuthor());
    }
}

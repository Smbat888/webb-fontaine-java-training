package Java.Week4.Library;

public class Author {
    private String name;
    private Book[] books;

    public static void arrayToString(Author[] authors, String[] authorNames) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Author(String name, Book[]books) {
        this.name = name;
        this.books = books;
    }

    public Author() {
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}

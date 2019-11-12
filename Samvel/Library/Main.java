
public class Main {
    public static void main(String[] args) {

        Author[] authors = AuthorBookAPI.getAuthors(6);
        Author.authorArrayToString(authors);

        Book[] books = AuthorBookAPI.getBooks(6);
        Book.bookArrayToString(books);

        System.out.println("");
        Book.bookArrayToString(AuthorBookAPI.getGivenAuthorsBooks(authors[2]));
    }
}

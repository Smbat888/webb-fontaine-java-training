package week4.book;

import java.util.Arrays;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class BookAPI {

    public static Book[] getAllBooks() {
        return BookRepository.getData();
    }

    public static Book[] getBooksOfGivenAuthor(Author author) {
        Book[] booksOfSpecificAuthor = new Book[10];
        int j = 0;
        while (j < 10) {
            Book[] books = getAllBooks();
            for (int i = 0; i < books.length; i++) {
                if (books[i].author.name.equals(author.name)) {
                    booksOfSpecificAuthor[j] = books[i];
                    j++;
                    if (j == booksOfSpecificAuthor.length)
                        return booksOfSpecificAuthor;
                }
            }
        }
        return booksOfSpecificAuthor;
    }

    public static Book[] getTop3BooksOfGivenAuthor(Author author) {
        Book[] top3Books = new Book[3];
        Book[] books = getBooksOfGivenAuthor(author);
        Arrays.sort(books);
        int j = 0;
        for (int i = books.length - 1; i >= 0; i--) {
            if (books[i] != null) {
                top3Books[j] = books[i];
                j++;
            }
            if (j == 4) {
                return top3Books;
            }
        }

        return top3Books;
    }

    public static Book[] getNamesOfMatchingBook(String string) {
        Book getNamesOfMatchingBook[] = new Book[BookRepository.getData().length];
        int j = 0;
        for (int i = 0; i < BookRepository.getData().length; i++) {
            if (string.equals(BookRepository.getData()[i].name)) {
                getNamesOfMatchingBook[j++] = BookRepository.getData()[i];
            }
        }
        return getNamesOfMatchingBook;
    }

    public static void getReleaseDtaesOfArrays(){
        Book[] books = new Book[getAllBooks().length];
        for (int i = 0; i < getAllBooks().length; i++) {
            books[i] = getAllBooks()[i];
            System.out.println(books[i].createRandomDate(1993,2019));

        }
    }

    
}

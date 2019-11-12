package week4.experiments.bzbzal;

import week4.book.Author;
import week4.book.AuthorRepository;
import week4.book.Book;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class BookRepository1 {

    static Author[] authors = AuthorRepository.getData();

    static String[] names = {"Sasna Crer", "Amenaqaj Hamon", "Qyartu VZgon"};

    public static Book1[] getData() {

        Book1[] books = new Book1[10];
        for (int i = 0; i < books.length; i++) {
            Book1 book1 = new Book1((int) Math.random() * 10);
            book1.name = names[(int) (Math.random() * 3)];
            book1.author = authors[(int) (Math.random() * 3)];
            books[i] = book1;
        }

        return books;
    }
}

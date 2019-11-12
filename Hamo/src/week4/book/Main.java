package week4.book;

import week4.book.AuthorRepository;
import week4.book.BookAPI;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Main {
    public static void main(String[] args) {

        Book[] authorBooks = BookAPI.getBooksOfGivenAuthor(AuthorRepository.getData()[(int) Math.random() * 10]);
        for (int i = 0; i < authorBooks.length; i++) {
            if (authorBooks[i] != null) {
                System.out.println(authorBooks[i].name);
            }
        }
    }
}

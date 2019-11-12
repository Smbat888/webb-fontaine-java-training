package week4.book;


/**
 * Created by: Hmayak on Nov, 2019
 */
public class Book implements Comparable<Book> {

    Author author;
    String name;
    int rank = 0;

    Book() {
    }

    public Book(int rank) {
        this.rank = rank;
    }

    public int compareTo(Book book) {
        if (this.rank > book.rank) {
            return 1;
        }
        if (this.rank < book.rank) {
            return -1;
        } else return 0;
    }

}

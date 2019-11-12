package week4.experiments.bzbzal;

import week4.book.Author;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Book1 {
    Author author;
    String name;
    int rank;

    Book1(int rank) {
        this.rank = rank;
    }

    public int compareTo(Book1 book1) {
        if (this.rank > book1.rank) {
            return 1;
        }
        if (this.rank < book1.rank) {
            return -1;
        } else return 0;
    }
}

package Java.Week4.Library;

import java.util.Arrays;
import java.util.Comparator;

import static Java.Week4.Library.AuthorRepo.authorNames;

public class Main {
    public static void main(String[] args) {
        printAuthors(authorNames);
        System.out.println();
        printBooks(BookRepo.getData());
        System.out.println();
        Author authors[] = AuthorRepo.getData();
        printBooks(authors[1]);
        System.out.println();
        Author.arrayToString(authors, authorNames);
        System.out.println();
        printPriorityBooks(authors[1]);
    }

    //get all authors
    public static void printAuthors(String[] authorNames) {
        for (String authorName : authorNames) {
            System.out.println("Authors: " + authorName);

        }
    }
    //get all books
    private static void printBooks(Book[][] bookNames) {
        for (Book[] authorBooks : bookNames) {
            for (Book book: authorBooks) {
                System.out.println("Books: " + book.getName());
            }
        }
    }

    //books of given author
    private static void printBooks (Author author) {
        for (Book book : author.getBooks()) {
            System.out.println("Author Books: " + book.getName());
        }
    }

    //get top 3 books of given author
    private static void printPriorityBooks (Author author) {
        Arrays.sort(author.getBooks(), Comparator.comparing(Book::getPopularity));
        for (int i = author.getBooks().length-1; i > author.getBooks().length-4; i--) {
            System.out.println("ppp: " + author.getBooks()[i].getName());
        }

    }
}

package Week4;

import java.time.LocalDate;
import java.util.Arrays;

public class LibraryAPI {
    public static Author[] getAuthorsData() {
        Author authors[] = new Author[10];
        for (int i = 0; i < authors.length; i++) {
            Author author = new Author(LibraryDataRepo.names[(i + 1) % 7],
                    LibraryDataRepo.surnames[(i + 1) % 7],
                    (int) (Math.random() * 100));
            authors[i] = author;
        }
        return authors;
    }

    public static Book[] getBookData(Author authors[]) {
        Book books[] = new Book[100];
        for (int i = 0; i < books.length; i++) {
            Book book = new Book(LibraryDataRepo.titles[(i + 1) % 7],
                    authors[(int) (Math.random() * authors.length)],
                    Book.createRandomDate(1900, 2000),
                    LibraryDataRepo.categories[(i + 1) % 7],
                    (float) Math.random() * 10);
            books[i] = book;
        }
        return books;
    }

    public static int getGivenBooksLength(Book[] books, Author author) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if (author.equals(books[i].getAuthor())) {
                length++;
            }
        }
        return length;
    }

    public static Book[] getGivenAuthorBooks(Book books[], Author author) {
        Book givenBooks[] = new Book[getGivenBooksLength(books, author)];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (author.equals(books[i].getAuthor())) {
                givenBooks[j++] = books[i];
            }
        }
        return givenBooks;
    }


    public static int getAllBooksLength(Book[] books, String name, String surname) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if ((books[i].getAuthor().getName().equals(name) || books[i].getAuthor().getSurname().equals(surname))) {
                length++;
            }
        }
        return length;
    }

    public static Book[] getTopThreeBooks(Book books[], String name, String surname) {
        Book allBooks[] = new Book[getAllBooksLength(books, name, surname)];
        Book topThreeBooks[] = new Book[3];
        int j = 0;
        int k = 0;
        boolean hasFound = false;
        if (name.length() <= 2 || surname.length() <= 2) {
            System.out.println("Please enter 3 characters");
            return new Book[0];
        }
        for (int i = 0; i < books.length; i++) {
            if ((books[i].getAuthor().getName().equals(name) || books[i].getAuthor().getSurname().equals(surname))) {
                allBooks[j] = books[i];
                j++;
                hasFound = true;
            }
        }
        if (!hasFound) {
            System.out.println("No Result");
            return new Book[0];
        }
        Arrays.sort(allBooks, LibraryAPI::compareBooks);
        for (int i = (allBooks.length) - 1; i >= (allBooks.length) - 3; i--) {
            topThreeBooks[k] = allBooks[i];
            k++;
        }
        return topThreeBooks;
    }

    public static int compareBooks(Book book1, Book book2) {
        if (book1 == null && book2 == null)
            return 0;
        if (book1 == null && book2 != null)
            return -1;
        if (book1 != null && book2 == null)
            return 1;
        return book1.getRating().compareTo(book2.getRating());
    }

    public static int getMatchingAuthorsLength(Author[] authors, String input) {
        int length = 0;
        for (int i = 0; i < authors.length; i++) {
            if (authors[i].getName().contains(input) || authors[i].getSurname().contains(input)) {
                length++;
            }
        }
        return length;
    }

    public static Author[] getAuthorsMatchingTheInput(Author[] authors, String input) {
        Author[] matchingAuthors = new Author[getMatchingAuthorsLength(authors, input)];
        int j = 0;
        boolean hasFound = false;
        if (input.length() <= 2) {
            System.out.println("Please enter 3 characters");
            return new Author[0];
        }
        for (int i = 0; i < authors.length; i++) {
            if ((authors[i].getName().contains(input) || authors[i].getSurname().contains(input))) {
                matchingAuthors[j] = authors[i];
                j++;
                hasFound = true;
            }
        }
        if (!hasFound) {
            System.out.println("No matching authors found");
        }
        return matchingAuthors;
    }

    public static int getMatchingBooksLength(Book[] books, String input) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().contains(input) || books[i].getCategory().contains(input)) {
                length++;
            }
        }
        return length;
    }

    public static Book[] getBooksMatchingTheInput(Book[] books, String input) {
        Book[] matchingBooks = new Book[getMatchingBooksLength(books, input)];
        int j = 0;
        boolean hasFound = false;
        if (input.length() <= 2) {
            System.out.println("Please enter 3 Characters");
            return new Book[0];
        }
        for (int i = 0; i < books.length; i++) {
            if ((books[i].getTitle().contains(input) || books[i].getCategory().contains(input))) {
                matchingBooks[j] = books[i];
                j++;
                hasFound = true;
            }
        }
        if (!hasFound) {
            System.out.println("No matching books found");
        }
        return matchingBooks;
    }

    public static int getBooksMatchingTheDateLength(Book[] books, LocalDate start, LocalDate end) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getReleaseDate().compareTo(start) >= 0 && books[i].getReleaseDate().compareTo(end) <= 0) {
                length++;
            }
        }
        return length;
    }

    public static Book[] getBooksMatchingTheDate(Book[] books, LocalDate start, LocalDate end) {
        if (start.compareTo(end) > 0) {
            System.out.println("Start date can't be greater than end date");
            return new Book[0];
        }
        Book[] booksMatchingDate = new Book[getBooksMatchingTheDateLength(books, start, end)];
        if (getBooksMatchingTheDateLength(books, start, end) == 0) {
            System.out.println("No results");
        }
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getReleaseDate().compareTo(start) >= 0 && books[i].getReleaseDate().compareTo(end) <= 0) {
                booksMatchingDate[j] = books[i];
                j++;
            }
        }
        return booksMatchingDate;
    }
}

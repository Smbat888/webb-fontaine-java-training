import java.time.LocalDate;

public class AuthorBookAPI {

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    public static Author[] getAuthors(int length) {
        Author[] authors = new Author[length];
        for (int i=0; i<length; i++) {
            authors[i] = new Author();
            authors[i].setAuthor(DataLibrary.names[i], DataLibrary.surnames[i], DataLibrary.ages[i]);
        }
        return authors;
    }

    public static Book[] getBooks(int length) {

        Book[] books = new Book[length];
        Author[] authors = AuthorBookAPI.getAuthors(6);
        for (int i=0; i<length; i++) {
            books[i] = new Book();
            books[i].setBook(DataLibrary.titles[i], authors[i], Math.random()*10, createRandomDate(1900, 2000));
        }
        return books;
    }

    public static Book[] getGivenAuthorsBooks(Author author) {
        Book[] allBooks = getBooks(6);
        int counter=0;
        for (int i=0; i<allBooks.length; i++) {
            if (allBooks[i].getBookAuthor().toString().equals(author.toString())) {
                counter++;
            }
        }
        Book[] givenBooks = new Book[counter];
        int j=0;
        for (int i=0; i<allBooks.length; i++) {
            if (allBooks[i].getBookAuthor().toString().equals(author.toString())) {
                givenBooks[j] = allBooks[i];
                j++;
            }
        }
        return givenBooks;
    }

    public static Author[] getAuthorsMatchingString (String string) {
        Author[] allAuthors = getAuthors(6);
        Author[] matchingAuthors = new Author[6];
        for (int i=0; i < allAuthors.length; i++) {
            if (allAuthors[i].toString().contains(string)) {
                matchingAuthors[i] = allAuthors[i];
            }
        }
        return matchingAuthors;
    }

    public static Book[] getBooksMatchingString (String string) {
        Book[] allBooks = getBooks(6);
        Book[] matchingBooks = new Book[6];
        for (int i=0; i<allBooks.length; i++) {
            if (allBooks[i].toString().contains(string)) {
                matchingBooks[i] = allBooks[i];
            }
        }
        return matchingBooks;
    }
}
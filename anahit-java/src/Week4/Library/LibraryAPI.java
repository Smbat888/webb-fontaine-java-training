import java.time.LocalDate;

public class LibraryAPI {
    private LibraryAPI() {
    }

    public static void arrayToString(Object[] array) {
        for (Object object : array) {
            System.out.println(object);
        }
    }

    public static Author[] getAllauthors() {
        Author[] authors = new Author[3];
        for (int i = 0; i < authors.length; i++) {
            Author author = new Author(DataRepo.names[(i + 1) % 3], DataRepo.lastNames[(i + 1) % 3], DataRepo.ages[(i + 1) % 3]);
            authors[i] = author;
        }
        return authors;
    }

    private static int createRandomIntBetween(int first, int second) {
        return first + (int) Math.round(Math.random() * (second - first));
    }

    public static LocalDate createRandomDate(int start, int end) {
        int day = createRandomIntBetween(1, 31);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(start, end);
        return LocalDate.of(year, month, day);
    }

    public static Book[] getBookData(Author authors[]) {
        Book books[] = new Book[3];
        for (int i = 0; i < books.length; i++) {
            Book book = new Book(DataRepo.titles[(i + 1) % 3],
                    authors[(int) (Math.random() * authors.length)],
                    createRandomDate(1700, 1900),
                    (float) Math.random() * 100);
            books[i] = book;
        }
        return books;
    }

    public static Author[] getAuthorsMatchingString(String string) {
        Author[] allAuthors = getAllauthors();
        Author[] matchingAuthors = new Author[3];
        for (int i = 0; i < allAuthors.length; i++) {
            if (allAuthors[i].toString().contains(string)) matchingAuthors[i] = allAuthors[i];
        }
        return matchingAuthors;
    }
}



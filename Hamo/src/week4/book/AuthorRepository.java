package week4.book;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class AuthorRepository {

    static String[] names = {"Lilia", "Smbat", "Vahram"};

    public static Author[] getData() {

        Author[] authors = new Author[10];
        for (int i = 0; i < authors.length; i++) {
            Author author = new Author();
            author.name = names[(int) (Math.random() * 3)];
            authors[i] = author;
        }
        return authors;
    }

}

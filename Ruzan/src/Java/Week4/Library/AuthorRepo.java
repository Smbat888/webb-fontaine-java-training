package Java.Week4.Library;

public class AuthorRepo {
    static String [ ] authorNames = {"Hovhannes Tumanyan", "Theodor Dreiser", "Eric Maria Remark"};
    public static Author [] getData() {
        Book[][] books = BookRepo.getData();
        Author [] authors = new Author [authorNames.length];
        for (int i = 0; i < authors.length; i++) {
            Author author = new Author(authorNames [i], books[i]);
            authors [i] = author;
        }

        return authors;
    }

    public static String[] getAuthorNames() {
        return authorNames;
    }

    public static void setAuthorNames(String[] authorNames) {
        AuthorRepo.authorNames = authorNames;
    }


}

package week4.book;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class AuthorAPI {

    public Author[] getAllBooks() {
        return AuthorRepository.getData();
    }


    public String[] getAuthors() {
        String[] authorName = new String[AuthorRepository.getData().length];
        for (int i = 0; i < AuthorRepository.getData().length; i++) {
            authorName[i] = AuthorRepository.getData()[i].name;
        }
        return authorName;
    }
}

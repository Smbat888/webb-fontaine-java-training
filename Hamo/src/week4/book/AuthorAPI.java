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

    public static Author[] matchinNamesToGivenString(String string) {
        int j = 0;
        Author matchinNamesToGivenString[] = new Author[AuthorRepository.getData().length];
        for (int i = 0; i < AuthorRepository.getData().length; i++) {
            if (string.equals(AuthorRepository.getData()[i].name)) {
                matchinNamesToGivenString[j++] = AuthorRepository.getData()[i];
            }
        }
        return matchinNamesToGivenString;
    }
}

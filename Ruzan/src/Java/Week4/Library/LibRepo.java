package Java.Week4.Library;

import java.util.HashMap;
import java.util.Map;

public class LibRepo {
    public static Map<Author, Book[]> getData() {
        Map<Author, Book[]> libData = new HashMap<>();
        Author[] aut = AuthorRepo.getData();
        Book[][] books = BookRepo.getData();
        for (int i = 0; i < aut.length; i++) {
            libData.put(aut[i], books[i]);
        }
        return libData;
    }

}

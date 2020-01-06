public class Main {
    public static void main(String[] args) {
        LibraryAPI.arrayToString(LibraryAPI.getAllauthors());
        LibraryAPI.arrayToString(LibraryAPI.getBookData(LibraryAPI.getAllauthors()));
        LibraryAPI.arrayToString(LibraryAPI.getAuthorsMatchingString("Brown"));
    }
}

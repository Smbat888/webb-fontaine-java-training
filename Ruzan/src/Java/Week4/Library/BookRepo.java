package Java.Week4.Library;

public class BookRepo {
    static String [ ] bookNames1 = {"Shunn u katun", "Tmkaberdi arume", "Loreci Saqon", "Merjac orenq"};
    static String [ ] bookNames2 = {"American Tragedy", "The financier", "The Genius", "The Titan"};
    static String [ ] bookNames3 = {"Triumphal arch", "Three comrades", "the road back", "Heaven has no favorites"};

    public static Book [][] getData() {

        Book [][] books = new Book[3][bookNames1.length];
        for (int i = 0; i < bookNames1.length; i++) {
            Book book = new Book (bookNames1[i], i+1);

            books[0][i] = book;
        }

        for (int i = 0; i < bookNames2.length; i++) {
            Book book = new Book (bookNames2[i],i+1);

            books[1][i] = book;
        }

        for (int i = 0; i < bookNames3.length; i++) {
            Book book = new Book (bookNames3[i], i+1);

            books[2][i] = book;
        }

        return books;
    }

}


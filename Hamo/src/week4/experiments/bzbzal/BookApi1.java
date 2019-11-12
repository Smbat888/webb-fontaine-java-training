//package week4.experiments.bzbzal;
//
//import week4.book.Book;
//import week4.book.BookRepository;
//
//import java.util.Arrays;
//
///**
// * Created by: Hmayak on Nov, 2019
// */
//public class BookApi1 {
//    public static Book1[] getAllBooks() {
//        return BookRepository1.getData();
//    }
//
//    public static Book1[] getBooksOfGivenAuthor(Author1 author1) {
//        Book1[] booksOfSpecificAuthor = new Book1[10];
//        Book1[] books = getAllBooks();
//        for (int i = 0; i < books.length; i++) {
//            int j = 0;
//            if (books[i].author.name.equals(author1.name) && books[i] != null) {
//                booksOfSpecificAuthor[j++] = books[i];
//            }
//        }
//        return booksOfSpecificAuthor;
//    }
//
//    public static Book1[] getTop3BooksOfGivenAuthor(Author1 author1) {
//        Book1[] top3Books = new Book1[3];
//        Book1[] books = getBooksOfGivenAuthor(author1);
//        Arrays.sort(books);
//        int j = 0;
//        for (int i = books.length -1; i >= 0; i++){
//            if(books[i] != null){
//                top3Books[j] = books[i];
//                j++;
//            }
//            if(j == 4){return top3Books;}
//        }
//
//        return top3Books;
//    }
//}

package Week4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get all authors
        System.out.println("All Authors: ");
        Author authors[] = LibraryAPI.getAuthorsData();
        LibraryDataRepo.ArrayToString(authors);
        System.out.println("All Books: ");
        // get all books
        Book books[] = LibraryAPI.getBookData(authors);
        LibraryDataRepo.ArrayToString(books);
        System.out.println();
        System.out.println("The books of requested author:");
        //get books of given author
        LibraryDataRepo.ArrayToString(LibraryAPI.getGivenAuthorBooks(books, books[2].getAuthor()));
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Enter Surname:");
        String surname = sc.next();
        //get the top 3 books of the given author
        System.out.println("Top 3 books of requested author:");
        Book topThreeBooks[] = LibraryAPI.getTopThreeBooks(books, name, surname);
        LibraryDataRepo.ArrayToString(topThreeBooks);
        System.out.println("Input:");
        String input = sc.next();
        //search authors matching the given string
        System.out.println("Result:");
        Author[] matchingAuthors = LibraryAPI.getAuthorsMatchingTheInput(authors, input);
        LibraryDataRepo.ArrayToString(matchingAuthors);
        System.out.println("input:");
        String input2 = sc.next();
        //search books matching the given string
        System.out.println("Result:");
        Book[] matchingBooks = LibraryAPI.getBooksMatchingTheInput(books, input2);
        LibraryDataRepo.ArrayToString(matchingBooks);
        System.out.println("From:(YYYY-MM-DD)");
        String date1 = sc.next();
        LocalDate startDate = LocalDate.parse(date1);
        System.out.println("To:(YYYY-MM-DD)");
        String date2 = sc.next();
        LocalDate endDate = LocalDate.parse(date2);
        //search books with release date period
        System.out.println("Books in the given period:");
        Book[] booksMatchingTheDate = LibraryAPI.getBooksMatchingTheDate(books, startDate, endDate);
        LibraryDataRepo.ArrayToString(booksMatchingTheDate);
    }
}

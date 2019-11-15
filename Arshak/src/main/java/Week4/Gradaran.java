package Week4;

import java.util.Scanner;

import static Week4.BookUtils.*;

public class Gradaran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq voronman tarberake:");
        System.out.println(" ");
        System.out.println("For search all books select 1");
        System.out.println("For search all authors select 2");
        System.out.println("For search books by word select 3");
        System.out.println("For search authors by word select 4");
        System.out.println("For search books by author select 5");
        System.out.println(" ");
        int z = input.nextInt();

        if (z == 1) {
            getAllBooks(Data.data);
        }

        if (z == 2) {
            getAllAuthors(Data.data);
        }

        if (z == 3) {
            getAllBooksByString(Data.data);
        }
        if (z==4){
            getAllAuthorsByString(Data.data);
        }

        if(z==5){
            getAllBooksByAuthor(Data.data);
        }


    }
}

package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class BookUtils {
    public static void getAllAuthors(ArrayList<Book> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getAuthor());

        }


    }


    public static void getAllBooks(ArrayList<Book> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getVernagir());

        }
    }

    public static void getAllBooksByString(ArrayList<Book> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq voronman bare(Ushadir exeq mecatar ev poqratar barerin):");
        String z = input.nextLine();

        boolean v = false;
        for (int i = 0; i < list.size(); i++) {

            String vernagir = list.get(i).getVernagir();
            if (vernagir.contains(z)) {
                v = true;
                System.out.println(vernagir);
            }
        }

        if (v == false) {
            System.out.println("Voronman ardyunqe datarke");
        }


    }

    public static void getAllAuthorsByString(ArrayList<Book> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq voronman bare,hexinakin pntrelu hamar:");
        String z = input.nextLine();

        boolean v = false;
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            Author author = book.getAuthor();
            String anun = author.getAnun();
            String azganun = author.getAzganun();
            String x = anun + azganun;
            if (x.contains(z)) {
                v = true;
                System.out.println(anun + " " + azganun);
            }
        }

        if (v == false) {
            System.out.println("Voronman ardyunqe datarke");
        }


    }


    public static void getAllBooksByAuthor(ArrayList<Book> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mutqagreq hexinakin (Anun Azganun):");
        String z = input.nextLine();

        boolean v = false;
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            Author author = book.getAuthor();
            String anun = author.getAnun();
            String azganun = author.getAzganun();
            String x = anun + " " + azganun;
            if (z.equals(x)) {
                v = true;
                System.out.println(book.getVernagir());
            }
        }

        if (v == false) {
            System.out.println("Voronman ardyunqe datarke");
        }


    }
}

package Week4;

import java.util.ArrayList;

public class Data {

    public static ArrayList<Book> data = new ArrayList<>();

    static {
        Author author1 = new Author("Aleksandr", "Pushkin", "Russia");
        Author author2 = new Author("Aleksandr", "Dyuma", "French");
        Author author3 = new Author("Fyodor", "Dostoevskiy", "Russia");
        Author author4 = new Author("Agata", "Kristi", "England");

        Book book1 = new Book("Ruslan i Lyudmila", 524, author1);
        Book book2 = new Book("Graf Monte Kristo", 585, author2);
        Book book3 = new Book("Evgeniy Onegin", 475, author1);
        Book book4 = new Book("Ubiystvo v Vostochnom Eksprese", 225, author4);
        Book book5 = new Book("Prestuplenie i Nakazanie", 475, author3);
        Book book6 = new Book("Tri Mushketyora", 702, author2);
        Book book7 = new Book("Besi", 385, author3);
        Book book8 = new Book("Desyat Negrityat", 250, author4);

        data.add(book1);
        data.add(book2);
        data.add(book3);
        data.add(book4);
        data.add(book5);
        data.add(book6);
        data.add(book7);
        data.add(book8);


    }


}


package org.example.OOP.Lesson6.ClassWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        BookGenre bookGenre1 = new BookGenre("комедия");
//        BookGenre bookGenre2 = new BookGenre("драмма");
//        BookGenre bookGenre3 = new BookGenre("комикс");
//        Book book1 = new Book("ASD1", "qwe", 1995, bookGenre1);
//        Book book2 = new Book("ASD2", "qwe", 2000, bookGenre2);
//        Book book3 = new Book("ASD3", "qwe", 2008, bookGenre3);
//        List<Book> books = new ArrayList<>(Arrays.asList(book1,book2,book3));
//        Library library = new Library(Arrays.asList(book1,book2,book3);

        Library library = new Library(Arrays.asList(
                new Book("ASD1", "qwe1", 1995, new BookGenre("комедия")),
                new Book("ASD2", "qwe2", 2000, new BookGenre("драмма")),
                new Book("ASD3", "qwe3", 2008, new BookGenre("комикс"))));

        System.out.println("library.searchAuthor(\"qwe1\") = " + library.searchAuthor("qwe1"));
        System.out.println("library.searchAuthor(\"qwe3\") = " + library.searchAuthor("qwe3"));
        System.out.println(" ");
        Formatter formatter = new JasonFormatter();
        formatter.formatted(library.getBooks());
    }
}

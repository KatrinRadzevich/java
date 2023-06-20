package org.example.Lesson3.HomeWork.Task3;

import java.util.ArrayList;
import java.util.List;
//Найти названия книг, в которых простое количество страниц,
// фамилия автора содержит «А» и год издания после 2010 г, включительно.

public class Main {
    public static void main(String[] args) {
        List<Book> books = create();
        for (Book book : books) {
            if ((book.getSurname().toUpperCase().contains("А")) && (book.getYear() >= 2010) && (isSimple(book.getPages()))) {
                System.out.println("book.getBookName() = " + book.getBookName());
            }
        }
    }

    public static boolean isSimple(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Book> create() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Название1", "Булгаков1", 1.20, 2020, 20));
        books.add(new Book("Название2", "Маяковский2", 2.20, 2010, 7));
        books.add(new Book("Название3", "Булгаков3", 3.10, 2009, 11));
        books.add(new Book("Название4", "Пушкин4", 5.00, 2013, 3));
        books.add(new Book("Название5", "Булгаков5", 6.80, 2016, 5));


        return books;
    }
}

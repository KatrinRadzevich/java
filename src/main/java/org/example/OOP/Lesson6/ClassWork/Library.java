package org.example.OOP.Lesson6.ClassWork;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public List<Book> searchAuthor(String author) {
        List<Book> resultBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) resultBooks.add(book);
        }
        return resultBooks;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}

package org.example.OOP.Lesson6.ClassWork;

public class BookGenre implements Genre {

    String genre;

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}

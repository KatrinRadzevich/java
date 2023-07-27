package org.example.OOP.Lesson6.ClassWork;

import java.util.List;

public class NoFormatter implements Formatter{
    @Override
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println(book + " была переведена в формат " + Format.NOFORMAT);
        }
    }
}

package org.example.OOP.Lesson6.ClassWork;

public class ElectronicBook extends Book{
    String format;
    Integer size;


    public ElectronicBook(String name, String author, int age, String format, Integer size, BookGenre bookGenre) {
        super(name, author, age, bookGenre);
        this.format = format;
        this.size = size;
    }

    public ElectronicBook() {
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}

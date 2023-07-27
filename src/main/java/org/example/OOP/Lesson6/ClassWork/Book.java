package org.example.OOP.Lesson6.ClassWork;

public class Book {
    private String name;
    private  String author;
    private int age;
    private BookGenre bookGenre;

    public Book(String name, String author, int age, BookGenre bookGenre) {
        this.name = name;
        this.author = author;
        this.age = age;
        this.bookGenre= bookGenre;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                ", bookGenre=" + bookGenre +
                '}';
    }
}

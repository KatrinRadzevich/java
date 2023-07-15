package org.example.OOP.Lesson3.ClassWork.Ex2;

public class Main {
    public static void main(String[] args) {
        Fruits fruit = Fruits.APPLE;

        switch (fruit) {
            case APPLE -> System.out.println("Яблоко");
            case ORANGE -> System.out.println("Апельсин");
            case PITCH -> System.out.println("Персик");
            default -> System.out.println("Фрукт не найден");

        }
        System.out.println(fruit.getNumber());
    }
}

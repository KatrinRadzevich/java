package org.example.OOP.Lesson2.ClassWork.Ex1;

public class Dog extends Animal {
    protected static int count;

    public Dog(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Пес", maxRunDistance, maxSwimDistance);
        count++;
    }
}

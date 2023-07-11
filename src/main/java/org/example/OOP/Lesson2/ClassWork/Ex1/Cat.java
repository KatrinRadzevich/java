package org.example.OOP.Lesson2.ClassWork.Ex1;

public class Cat extends Animal {

    protected static int count;


    public Cat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Кот", maxRunDistance, 0);
        count++;
    }
}

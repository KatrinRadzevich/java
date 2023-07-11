package org.example.OOP.Lesson2.ClassWork.Ex1;

public class HomeCat extends Cat {
    protected static int count;

    public HomeCat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, maxSwimDistance);
        count++;
    }
}

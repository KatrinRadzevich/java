package org.example.OOP.Lesson2.ClassWork.Ex1;

public class Animal {
    protected String name;
    protected static int count;
    protected String type;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal() {
    }

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        if (type.equals("Кот")) {
            if (maxRunDistance > 200) this.maxRunDistance = 200;
            this.maxSwimDistance = maxSwimDistance;

        } else {
            if (maxRunDistance > 500) this.maxRunDistance = 500;
            if (maxSwimDistance > 10) this.maxSwimDistance = 10;
        }
    }

    protected void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " пробежало дистанцию: " + distance + "км");
        } else {
            System.out.println(type + " " + name + " НЕ пробежало дистанцию: " + distance + "км");
        }
    }

    protected void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " смогло проплыть дистанцию: " + distance + "км");
        } else {
            System.out.println(type + " " + name + " НЕ смогло проплыть дистанцию: " + distance + "км");
        }
    }
}
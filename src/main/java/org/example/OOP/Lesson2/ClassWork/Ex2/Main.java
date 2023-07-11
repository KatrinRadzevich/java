package org.example.OOP.Lesson2.ClassWork.Ex2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        human.stop();
        human.drive(bicycle);
        human.stop();
        Motocycle motocycle = new Motocycle();
        human.drive(motocycle);
    }
}

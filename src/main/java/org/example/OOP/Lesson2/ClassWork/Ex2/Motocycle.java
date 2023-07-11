package org.example.OOP.Lesson2.ClassWork.Ex2;

public class Motocycle implements Transport{
    @Override
    public void start() {
        System.out.println("мото едет");
    }

    @Override
    public void stop() {
        System.out.println("мото едетостановился");
    }
}

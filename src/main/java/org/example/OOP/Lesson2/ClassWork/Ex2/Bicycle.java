package org.example.OOP.Lesson2.ClassWork.Ex2;

public class Bicycle implements Transport {
    @Override
    public void start() {
        System.out.println("велик едет");
    }

    @Override
    public void stop() {
        System.out.println("велик остановился");
    }
}

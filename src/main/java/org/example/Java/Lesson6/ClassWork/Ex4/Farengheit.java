package org.example.Java.Lesson6.ClassWork.Ex4;

public class Farengheit implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue * 1.8 + 32;
    }
}

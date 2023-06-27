package org.example.Lesson6.ClassWork.Ex4;

public class Kelvin implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }
}

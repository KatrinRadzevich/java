package org.example.OOP.Lesson2.HomeWork;

public class Treadmill implements Challenges {
    protected double length;
    public Treadmill(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Treadmill with length of " + length + "km";
    }
}

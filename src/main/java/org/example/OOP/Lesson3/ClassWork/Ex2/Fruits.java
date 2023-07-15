package org.example.OOP.Lesson3.ClassWork.Ex2;

public enum Fruits {
    APPLE(1), ORANGE(2), PITCH(3);

    private int number;

    Fruits(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

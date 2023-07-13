package org.example.OOP.Lesson2.HomeWork;

public class Wall implements Challenges {
    protected double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public double getLength() {
        return 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wall with height of " + height + "m";
    }
}

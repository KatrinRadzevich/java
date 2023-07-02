package org.example.OOP.Lesson1.ClassWork.Ex1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное по имени " + name);
    }

    public void voice() {
        System.out.println("Животное по имени " + name + " мяукает");
    }

    public void jump() {
        System.out.println("Животное по имени " + name + " прыгает");
    }
}

package org.example.OOP.Lesson1.ClassWork.Ex1;

public abstract class Animal {
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

    public abstract void animalInfo();
    public abstract void klubok();

    public void voice() {
        System.out.println("Животное по имени " + name + " мяукает");
    }

    public void jump() {
        System.out.println("Животное по имени " + name + " прыгает");
    }
}

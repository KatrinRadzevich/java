package org.example.OOP.Lesson1.ClassWork.Ex1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ronnie", "Gray", 2);
        System.out.println("Кот: " + cat1.getName() + " с цветом шерсти: " + cat1.getColour() + " с количеством годиков: " + cat1.getAge());
        cat1.setAge(-5);
        cat1.setAge(5);
        System.out.println("Кот: " + cat1.getName() + " с цветом шерсти: " + cat1.getColour() + " с количеством годиков: " + cat1.getAge());
    cat1.animalInfo();
    cat1.voice();
    cat1.jump();
    }
}

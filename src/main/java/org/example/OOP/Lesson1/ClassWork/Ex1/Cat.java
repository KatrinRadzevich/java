package org.example.OOP.Lesson1.ClassWork.Ex1;

public class Cat extends Animal {
    private String colour;
    private Integer age;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, String colour, Integer age) {
        super(name);
        this.colour = colour;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст введен некорректно");
        }
    }

    public Cat() {
    }

    @Override
    public void animalInfo() {
        System.out.println("Кот: " + super.getName() + " с цветом шерсти: " + getColour() + " с количеством годиков: " + getAge());
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст введен некорректно");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}

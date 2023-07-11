package org.example.OOP.Lesson1.ClassWork.Ex1;

public class Dog extends Animal {
    private String colour;
    private Integer age;

    public Dog(String name, String colour, Integer age) {
        super(name);
        this.colour = colour;
        this.age = age;
    }

    public Dog() {
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
        this.age = age;
    }

    @Override
    public void klubok() {
        System.out.println("пес " + super.getName() +
                ", с возрастом " + age + ", с цветом шерсти " +
                colour + " -- свернулся в клубок");
    }

    @Override
    public void animalInfo() {
        System.out.println("собака ");
    }

    @Override
    public void voice() {
        System.out.println("Животное по имени " + getName() + " гавкает");
    }
}

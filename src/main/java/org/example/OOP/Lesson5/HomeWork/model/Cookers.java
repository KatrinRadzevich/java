package org.example.OOP.Lesson5.HomeWork.model;

public class Cookers extends Worker {
    int cookerId;
    Integer salary;

    public Cookers(String name, String surname, Integer age, int cookerId, Integer salary) {
        super(name, surname, age);
        this.cookerId = cookerId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "COOKER : " + "cookerId = " + cookerId +
                ", name = " + name + ", surname = " + surname + ", age = " + age + ", salary=" + salary;
    }

    public Integer getSalary() {
        return salary;
    }
}

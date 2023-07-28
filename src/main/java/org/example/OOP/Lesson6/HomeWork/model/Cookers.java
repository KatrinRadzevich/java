package org.example.OOP.Lesson6.HomeWork.model;

public class Cookers extends Worker implements CookersResponsibilities{
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
                ", name = " + name + ", surname = " + surname + ", age = " + age + ", salary=" + salary + actions();
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String actions() {
        return " Готовит заказы, контролирует остатки на кухне";
    }
}

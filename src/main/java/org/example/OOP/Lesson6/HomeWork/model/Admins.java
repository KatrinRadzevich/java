package org.example.OOP.Lesson6.HomeWork.model;

public class Admins extends Worker implements AdminsResponsibilities {
    int adminId;
    Integer salary;

    public Admins(String name, String surname, Integer age, int adminId, Integer salary) {
        super(name, surname, age);
        this.adminId = adminId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ADMIN : " + "adminId = " + adminId +
                ", name = " + name + ", surname = " + surname + ", age = " + age + ", salary=" + salary + actions();
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String actions() {
        return " Принимает заказы, выдает заказы, работает с кассой";
    }
}

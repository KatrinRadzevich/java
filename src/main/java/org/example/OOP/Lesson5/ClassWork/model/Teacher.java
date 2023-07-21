package org.example.OOP.Lesson5.ClassWork.model;

public class Teacher extends User{
    int teacherId;

    public Teacher(String name, String surname, String patron, int teacherId) {
        super(name, surname, patron);
        this.teacherId = teacherId;
    }
}

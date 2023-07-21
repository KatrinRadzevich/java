package org.example.OOP.Lesson5.ClassWork.view;

import org.example.OOP.Lesson5.ClassWork.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("qwe", "asd", "zxc");
        controller.createStudent("qwe", "asd", "zxc");
        controller.createStudent("qwe", "asd", "zxc");
        controller.getAllStudent();
    }
}

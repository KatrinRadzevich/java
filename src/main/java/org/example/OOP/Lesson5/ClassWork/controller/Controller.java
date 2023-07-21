package org.example.OOP.Lesson5.ClassWork.controller;

import org.example.OOP.Lesson5.ClassWork.model.Student;
import org.example.OOP.Lesson5.ClassWork.model.Type;
import org.example.OOP.Lesson5.ClassWork.model.User;
import org.example.OOP.Lesson5.ClassWork.service.UserService;
import org.example.OOP.Lesson5.ClassWork.view.StudentView;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname, String patron) {
        userService.create(name, surname, patron, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> studentList = userService.readOnlyStudents();
        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }
}

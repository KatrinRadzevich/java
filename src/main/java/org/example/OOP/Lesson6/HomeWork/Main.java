package org.example.OOP.Lesson6.HomeWork;

import org.example.OOP.Lesson6.HomeWork.controller.Controller;
import org.example.OOP.Lesson6.HomeWork.model.Type;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createAdmin("Kate", "Smirnova", 19, 300);
        controller.createAdmin("Angel", "Smith", 25, 320);
        controller.createCooker("John", "Dough", 22, 400);
        controller.createWorker(Type.COOKER, "Alice", "Ivanova", 28, 480);
        controller.getOnlyCookers();
        System.out.println("------- ");
        controller.getOnlyAdmins();
        System.out.println("------- ");
        controller.getAllWorkers();
        System.out.println("------- ");
        controller.bestSalaryAdmin();
        controller.bestSalaryCooker();
    }
}

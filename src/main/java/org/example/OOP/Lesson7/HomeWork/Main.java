package org.example.OOP.Lesson7.HomeWork;

import org.example.OOP.Lesson7.HomeWork.log.ConsoleLogger;
import org.example.OOP.Lesson7.HomeWork.log.LogCalculableFactory;
import org.example.OOP.Lesson7.HomeWork.service.ICalculableFactory;
import org.example.OOP.Lesson7.HomeWork.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}

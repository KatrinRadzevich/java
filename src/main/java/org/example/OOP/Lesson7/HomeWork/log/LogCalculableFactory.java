package org.example.OOP.Lesson7.HomeWork.log;

import org.example.OOP.Lesson7.HomeWork.controller.Calculator;
import org.example.OOP.Lesson7.HomeWork.model.Calculable;
import org.example.OOP.Lesson7.HomeWork.service.ICalculableFactory;
import org.example.OOP.Lesson7.HomeWork.view.LogCalculator;

public class LogCalculableFactory implements ICalculableFactory {

    private Logable logger;

    public LogCalculableFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(String primaryArg) {
        return new LogCalculator(new Calculator(primaryArg),logger);
    }
}

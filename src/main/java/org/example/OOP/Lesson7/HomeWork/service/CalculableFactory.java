package org.example.OOP.Lesson7.HomeWork.service;

import org.example.OOP.Lesson7.HomeWork.controller.Calculator;
import org.example.OOP.Lesson7.HomeWork.model.Calculable;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(String primaryArg) {
        return new Calculator(primaryArg);
    }
}

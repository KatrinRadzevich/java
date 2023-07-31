package org.example.OOP.Lesson7.HomeWork.service;

import org.example.OOP.Lesson7.HomeWork.model.Calculable;

public interface ICalculableFactory {
    Calculable create(String primaryArg);
}

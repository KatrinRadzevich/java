package org.example.OOP.Lesson6.HomeWork.service;

import org.example.OOP.Lesson6.HomeWork.model.Admins;
import org.example.OOP.Lesson6.HomeWork.model.Cookers;
import org.example.OOP.Lesson6.HomeWork.model.Type;
import org.example.OOP.Lesson6.HomeWork.model.Worker;

import java.util.List;

public interface DataService {
    void create(Type type, String name, String surname, Integer age, Integer salary);

    List<Worker> read();

    List<Cookers> readOnlyCookers();

    List<Admins> readOnlyAdmins();
}

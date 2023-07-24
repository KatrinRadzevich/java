package org.example.OOP.Lesson5.HomeWork.service;

import org.example.OOP.Lesson5.HomeWork.model.Admins;
import org.example.OOP.Lesson5.HomeWork.model.Cookers;
import org.example.OOP.Lesson5.HomeWork.model.Type;
import org.example.OOP.Lesson5.HomeWork.model.Worker;

import java.util.ArrayList;
import java.util.List;

public class WorkerService implements DataService {

    private List<Worker> workerList = new ArrayList<>();
    private List<Cookers> cookerList = new ArrayList<>();
    private List<Admins> adminList = new ArrayList<>();


    @Override
    public void create(Type type, String name, String surname, Integer age, Integer salary) {
        int id = getFreeId(type);
        if (Type.COOKER == type) {
            Cookers cooker = new Cookers(name, surname, age, id, salary);
            workerList.add(cooker);
            cookerList.add(cooker);
        }
        if (Type.ADMIN == type) {
            Admins admin = new Admins(name, surname, age, id, salary);
            workerList.add(admin);
            adminList.add(admin);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isCooker = Type.COOKER == type;
        for (Worker worker : workerList) {
            if (worker instanceof Admins && !isCooker) {
                lastId++;
            }
            if (worker instanceof Cookers && isCooker) {
                lastId++;
            }
        }
        return ++lastId;
    }

    @Override
    public List<Worker> read() {
        return workerList;
    }

    @Override
    public List<Cookers> readOnlyCookers() {
        return cookerList;
    }

    @Override
    public List<Admins> readOnlyAdmins() {
        return adminList;
    }
}

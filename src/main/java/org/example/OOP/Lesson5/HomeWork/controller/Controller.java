package org.example.OOP.Lesson5.HomeWork.controller;

import org.example.OOP.Lesson5.HomeWork.model.Admins;
import org.example.OOP.Lesson5.HomeWork.model.Cookers;
import org.example.OOP.Lesson5.HomeWork.model.Type;
import org.example.OOP.Lesson5.HomeWork.model.Worker;
import org.example.OOP.Lesson5.HomeWork.service.WorkerService;
import org.example.OOP.Lesson5.HomeWork.view.WorkerView;

import java.util.List;

public class Controller {

    private final WorkerService workerService = new WorkerService();
    private final WorkerView workerView = new WorkerView();

    public void createWorker(Type type, String name, String surname, Integer age, Integer salary) {
        workerService.create(type, name, surname, age, salary);
    }

    public void createAdmin(String name, String surname, Integer age, Integer salary) {
        workerService.create(Type.ADMIN, name, surname, age, salary);
    }

    public void createCooker(String name, String surname, Integer age, Integer salary) {
        workerService.create(Type.COOKER, name, surname, age, salary);
    }

    public void getAllWorkers() {
        List<Worker> workerList = workerService.read();
        for (Worker worker : workerList) {
            workerView.printWorkers(worker);
        }
    }

    public void getOnlyCookers() {
        List<Cookers> cookers = workerService.readOnlyCookers();
        for (Cookers cooker : cookers) {
            workerView.printCookers(cooker);
        }
    }

    public void getOnlyAdmins() {
        List<Admins> admins = workerService.readOnlyAdmins();
        for (Admins admin : admins) {
            workerView.printAdmins(admin);
        }
    }

    public int getBestSalaryAdmin() {
        int bestSalary = 0;
        List<Admins> admins = workerService.readOnlyAdmins();
        for (Admins admin : admins) {
            if (bestSalary < admin.getSalary()) bestSalary = admin.getSalary();
        }
        return bestSalary;
    }

    public void bestSalaryAdmin() {
        int bestSalary = 0;
        List<Admins> admins = workerService.readOnlyAdmins();
        for (Admins admin : admins) {
            if (bestSalary < admin.getSalary()) bestSalary = admin.getSalary();
            if (admin.getSalary().equals(getBestSalaryAdmin()))
                workerView.printBestSalaryWorker(admin);
        }
    }

    public int getBestSalaryCooker() {
        int bestSalary = 0;
        List<Cookers> cookers = workerService.readOnlyCookers();
        for (Cookers cooker : cookers) {
            if (bestSalary < cooker.getSalary()) bestSalary = cooker.getSalary();
        }
        return bestSalary;
    }

    public void bestSalaryCooker() {
        List<Cookers> cookers = workerService.readOnlyCookers();
        for (Cookers cooker : cookers) {
            if (cooker.getSalary().equals(getBestSalaryCooker()))
                workerView.printBestSalaryWorker(cooker);
        }
    }
}

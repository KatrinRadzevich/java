package org.example.OOP.Lesson7.HomeWork.log;

public class ConsoleLogger implements Logable {
    @Override
    public void log(String message) {
        System.out.println(" LOG :  " + message);
    }
}

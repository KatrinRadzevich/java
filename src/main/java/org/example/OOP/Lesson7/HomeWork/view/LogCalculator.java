package org.example.OOP.Lesson7.HomeWork.view;

import org.example.OOP.Lesson7.HomeWork.log.Logable;
import org.example.OOP.Lesson7.HomeWork.model.Calculable;

public class LogCalculator implements Calculable {

    private Calculable decorated;
    private Logable logable;

    public LogCalculator(Calculable decorated, Logable logable) {
        this.decorated = decorated;
        this.logable = logable;
    }

    @Override
    public String sum(String arg) {
        logable.log("вызвался метод суммы с параметром : " + arg);
        return decorated.sum(arg);
    }

    @Override
    public String multi(String arg) {
        logable.log("вызвался метод умножения с параметром : " + arg);
        return decorated.multi(arg);
    }

    @Override
    public String del(String arg) {
        logable.log("вызвался метод деления с параметром : " + arg);
        return decorated.del(arg);
    }

    @Override
    public String getResult() {
        logable.log("пользователь запросил результат!");
        return decorated.getResult();
    }
}

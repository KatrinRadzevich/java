package org.example.OOP.Lesson7.HomeWork.view;

import org.example.OOP.Lesson7.HomeWork.model.Calculable;
import org.example.OOP.Lesson7.HomeWork.service.ICalculableFactory;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            String primaryArg = prompt("Введите первый аргумент(например 2+3i): ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    String arg = prompt("Введите второй аргумент(например 4+5i): ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    String arg = prompt("Введите второй аргумент(например 4+5i): ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    String arg = prompt("Введите второй аргумент(например 4+5i): ");
                    calculator.del(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат: " + result);
                    break;
                }

            }
            String cmd = prompt("\nЕще посчитать (Y/N)?");
            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

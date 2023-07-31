package org.example.OOP.Lesson7.HomeWork.controller;

import org.example.OOP.Lesson7.HomeWork.model.Calculable;

public final class Calculator implements Calculable {

    private String primaryArg;
    private String answer;

    public Calculator(String primaryArg) {
        this.primaryArg = primaryArg;

    }

    /**
     * @param string строка с комплексным числом
     * @return array массив типа String состоящий только из чисел
     * @apiNote конвертация комплексного числа в массив только из вещественных чисел
     */
    public String[] arrayNums(String string) {
        String[] array = string.replaceAll("[+i(), ]", "").split("");
        return array;
    }

    @Override
    public String sum(String arg) {
        String[] firstNum = arrayNums(primaryArg);
        int a1 = Integer.parseInt(firstNum[0]);
        int b1 = Integer.parseInt(firstNum[1]);
        String[] SecondNum = arrayNums(arg);
        int a2 = Integer.parseInt(SecondNum[0]);
        int b2 = Integer.parseInt(SecondNum[1]);
        int result1 = a1 + a2;
        int result2 = b1 + b2;
        answer = result1 + " + " + result2 + "i";
        return answer;
    }

    @Override
    public String multi(String arg) {
        String[] firstNum = arrayNums(primaryArg);
        int a1 = Integer.parseInt(firstNum[0]);
        int b1 = Integer.parseInt(firstNum[1]);
        String[] SecondNum = arrayNums(arg);
        int a2 = Integer.parseInt(SecondNum[0]);
        int b2 = Integer.parseInt(SecondNum[1]);
        int result1 = a1 * a2 - b1 * b2;
        int result2 = b1 * a2 + a1 * b2;
        answer = result1 + " + " + result2 + "i";
        return answer;
    }

    @Override
    public String del(String arg) {
        String[] firstNum = arrayNums(primaryArg);
        double a1 = Double.parseDouble(firstNum[0]);
        double b1 = Double.parseDouble(firstNum[1]);
        String[] SecondNum = arrayNums(arg);
        double a2 = Double.parseDouble(SecondNum[0]);
        double b2 = Double.parseDouble(SecondNum[1]);
        double result1 = (a1 * a2 + b1 * b2) / (a2 * a2 + b2 * b2);
        double result2 = (b1 * a2 - a1 * b2) / (a2 * a2 + b2 * b2);
        if (result2 == 0.0) {
            answer = String.valueOf(result1);
        }
        if (result2 < 0.0) {
            answer = result1 + " - " + -result2 + "i";
        }
        if (result2 > 0.0) {
            answer = result1 + " + " + result2 + "i";
        }
        return answer;
    }

    @Override
    public String getResult() {
        return this.answer;
    }
}

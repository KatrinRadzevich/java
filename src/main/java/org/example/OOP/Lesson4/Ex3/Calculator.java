package org.example.OOP.Lesson4.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /**
     * @param numbers - массив чисел
     * @return сумма всех элементов массива
     * @apiNote Написать класс калькулятор, принимающий List целочисленных значений,возвращающий сумму элементов коллекции(метод sum)
     */
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    public Double mult(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }

    public Double div(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res /= number.doubleValue();
        }
        return res;
    }

    public List<Integer> binary(List<?> someList) {
        List<Integer> res = new ArrayList<>();
        for (Object o : someList) {
            res.add(Integer.valueOf(Integer.toBinaryString(Integer.parseInt(String.valueOf(o)))));
        }
        return res;
    }
}

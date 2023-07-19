package org.example.OOP.Lesson4.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            doubleList.add((double) i);
            integerList.add(i);
        }

        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            stringList.add(String.valueOf(i));
        }

        System.out.println("calculator.sum(doubleList) = " + calculator.sum(doubleList));
        System.out.println("calculator.sum(integerList) = " + calculator.sum(integerList));
        System.out.println("calculator.mult(doubleList) = " + calculator.mult(doubleList));
        System.out.println("calculator.div(doubleList) = " + calculator.div(doubleList));
        System.out.println("calculator.binary(stringList) = " + calculator.binary(stringList));
        System.out.println("calculator.binary(integerList) = " + calculator.binary(integerList));
    }
}

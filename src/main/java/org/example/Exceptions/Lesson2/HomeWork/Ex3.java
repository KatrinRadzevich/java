package org.example.Exceptions.Lesson2.HomeWork;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        printDiv(90, 3);
        printSum(23, 234);
        printArray(3);
    }

    public static void printArray(int index) {
        int[] abc = {1, 2};
        if (index <= abc.length) {
            for (int i = 0; i < abc.length; i++) {
                abc[index] = 9;
            }
            System.out.println("abc = " + Arrays.toString(abc));
        } else System.out.println("Массив выходит за пределы своего размера!");

    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void printDiv(Integer a, Integer b) {
        if (b != 0) System.out.println(a / b);
        else System.out.println("Делить на ноль невозможно!");
    }
}

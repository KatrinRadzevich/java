package org.example.Java.Lesson3.HomeWork.Task4;

import java.util.ArrayList;
import java.util.Collections;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(1);
        Collections.sort(list);

        System.out.println("минимальное = " + list.get(0));
        System.out.println("среднее = " + list.get(list.size() / 2));
        System.out.println("максимальное = " + list.get(list.size() - 1));
    }
}

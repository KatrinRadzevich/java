package org.example.Lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;

//Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        Random random = new Random();
        Integer size = 10;
        for (int i = 0; i < size; i++) {
            myList.add(random.nextInt(10));
        }
        System.out.println("myList = " + myList);
        Integer sumPositive = getSumPositive(myList);
        System.out.println("sumPositive = " + sumPositive);
    }

    /**
     * @param myList
     * @return sumPositive
     * @apiNote находит сумму четных элементов списка
     */
    private static int getSumPositive(LinkedList<Integer> myList) {
        Integer sumPositive = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                sumPositive += myList.get(i);
            }
        }
        return sumPositive;
    }
}
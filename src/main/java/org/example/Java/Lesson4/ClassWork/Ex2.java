package org.example.Java.Lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        Random random = new Random();
        Integer size = 10;
        for (int i = 0; i < size; i++) {
            myList.add(random.nextInt(10));
        }
        System.out.println("original myList = " + myList);
        Integer sumPositive = getSumPositive(myList);
        System.out.println("sumPositive = " + sumPositive);
        changingNums(myList, sumPositive);
        System.out.println("changed myList = " + myList);
    }

    /**
     * @param myList
     * @apiNote заменяет некратные 3 элементы списка
     */
    private static void changingNums(LinkedList<Integer> myList, Integer sumPositive) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 3 != 0) {
                myList.set(i, sumPositive);
            }
        }
    }

    /**
     * @param myList
     * @return sumPositive
     * @apiNote находит сумму нечетных элементов списка
     */
    private static int getSumPositive(LinkedList<Integer> myList) {
        Integer sumPositive = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 != 0) {
                sumPositive += myList.get(i);
            }
        }
        return sumPositive;
    }
}

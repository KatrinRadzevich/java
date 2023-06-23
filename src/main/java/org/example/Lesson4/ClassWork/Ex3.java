package org.example.Lesson4.ClassWork;

import java.util.Arrays;
import java.util.LinkedList;

//Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
public class Ex3 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1, -1, -2, 10, -3, 5, 10, -3));
        System.out.println("myList = " + myList);
        deleteNegativeNums(myList);
        System.out.println("myList = " + myList);
    }

    private static void deleteNegativeNums(LinkedList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < 0) {
                myList.remove(i);
                i--;
            }
        }
    }
}

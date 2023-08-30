package org.example.Java.Lesson6.ClassWork;
//Дан массив чисел, посчитать процент уникальных чисел.
//        *процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2));
        Set<Integer> set = new HashSet<>(array);
//        for (int i = 0; i < array.size(); i++) {
//            set.add(array.get(i));
//        }
        double percent = set.size() * 100 / array.size();
        System.out.println(percent);
    }
}

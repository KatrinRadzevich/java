package org.example.Java.Lesson6.ClassWork;

import java.util.*;

//Найти пересечения слов в массивах и указать их общее количество.
//        Пример:
//        Mas1= [“qwe”,”asd”,”qwe”,”x”]
//        Mas2=[“qwe”,”v”]
//        Результат:qwe=3
public class Ex3 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        Set<String> set = new HashSet<>(mas1);
        set.retainAll(mas2);
        System.out.println("set = " + set);

        Map<String, Integer> map = new HashMap<>();

        for (String s : set) {
            for (String s2 : mas1) {
                if (s2.equals(s) && map.containsKey(s2)) {
                    map.put(s2, map.get(s2) + 1);
                } else if (s2.equals(s)) {
                    map.putIfAbsent(s2, 1);
                }
            }
            for (String s2 : mas2) {
                if (s2.equals(s) && map.containsKey(s2)) {
                    map.put(s2, map.get(s2) + 1);
                } else if (s2.equals(s)) {
                    map.putIfAbsent(s2, 1);
                }
            }
            System.out.println(s + " = " + map.get(s));
        }
    }
}

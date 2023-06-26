package org.example.Lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;
//Посчитать количество вхождений каждого символа в  текст
public class Ex1 {
    public static void main(String[] args) {
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "vgfde gferw grews gfrw";
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i), 0);
            mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            char currentChar = str.charAt(i);
//            if (!mapCh.containsKey(currentChar)) {
//                mapCh.put(currentChar, 1);
//            } else {
//                mapCh.put(currentChar, mapCh.get(currentChar) + 1);
//            }
        }
        for (Map.Entry<Character, Integer> entry : mapCh.entrySet()) {
            System.out.println(entry.getKey() + " встретился в тексте " + entry.getValue() + " раз(а)");
        }
    }
}

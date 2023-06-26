package org.example.Lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("transformArabic(text) = " + transformArabic("LVIII"));
        System.out.println("transformArabic(text) = " + transformArabic("MCMXCIV"));
    }

    /**
     * @param text
     * @return арабское число
     * @apiNote Написать перевод из римских цифр в арабские
     */
    private static Integer transformArabic(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        Integer result = map.get(text.charAt(text.length() - 1));
        for (int i = 0; i < text.length() - 1; i++) {
            if (map.get(text.charAt(i)) < map.get(text.charAt(i + 1))) {
                result -= map.get(text.charAt(i));
            } else {
                result += map.get(text.charAt(i));
            }
        }
        return result;
    }
}

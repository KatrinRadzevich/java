package org.example.Java.Lesson5.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        String myList = ("Иван Иванов, Анна Крутова, Петр Чернышов, Светлана Петрова, Иван Иванов, Анна Мусина," +
                " Кристина Белова, Анна Мусина, Петр Чернышов, Анна Мусина, Анна Крутова");
        quantityOfRepeat(myList);
    }

    /**
     * @param myList
     * @apiNote Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
     */
    private static void quantityOfRepeat(String myList) {
        Map<String, Integer> myMap = new HashMap<>();
        String[] names = myList.split(", ");
        for (int i = 0; i < names.length; i++) {
            String currentName = names[i];
            if (!myMap.containsKey(currentName)) {
                myMap.put(currentName, 1);
            } else {
                myMap.put(currentName, myMap.get(currentName) + 1);
            }
        }
        myMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}

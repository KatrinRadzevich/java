package org.example.Lesson5.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase().replaceAll("\\p{IsPunctuation}", "");
        Scanner sc = new Scanner(System.in);
        quantityOfWord(text, sc);
    }

    /**
     * @param text Данный текст
     * @param sc   Сканнер для ввода искомого слова
     * @apiNote Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
     */
    private static void quantityOfWord(String text, Scanner sc) {
        Map<String, Integer> myMap = new HashMap<>();
        System.out.println("Введите искомое слово: ");
        String[] words = text.split(" ");
        String keyWord = sc.nextLine().toLowerCase();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(keyWord)) {
                String currentWord = words[i];
                if (!myMap.containsKey(currentWord)) {
                    myMap.put(currentWord, 1);
                } else {
                    myMap.put(currentWord, myMap.get(currentWord) + 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

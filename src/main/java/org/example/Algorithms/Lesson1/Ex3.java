package org.example.Algorithms.Lesson1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        variantsQuantity(n);
    }

    /**
     * @apiNote Алгоритм поиска всех доступных комбинаций для количества кубиков 4 с количеством граней N.
     * @param n максимальное количество граней
     */
    public static void variantsQuantity(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int l = 1; l <= n; l++) {
                        count++;
                    }
                }
            }
        }
        System.out.println("count = " + count);
    }
}

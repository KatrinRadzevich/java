package org.example.Algorithms.Lesson1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        isSimple(n);
    }

    /**
     * @param n - конец диапазона
     * @apiNote Алгоритм поиска простых чисел в диапазоне от 1 до N
     */
    public static void isSimple(int n) {
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) flag = false;
            }
            if (flag) System.out.println(i);
        }
    }
}

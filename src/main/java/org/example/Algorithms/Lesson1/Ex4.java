package org.example.Algorithms.Lesson1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fib(scanner.nextInt()) = " + fib(scanner.nextInt()));
    }

    /**
     * @param n член последовательности Фибоначчи
     * @return значение
     * @apiNote Алгоритм поиска нужного числа последовательности Фибоначчи(рекурсия)
     */
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

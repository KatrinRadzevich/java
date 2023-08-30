package org.example.Algorithms.Lesson1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fib(scanner.nextInt()) = " + fib(scanner.nextInt()));
    }

    /**
     * @param n член последовательности Фибоначчи
     * @return значение
     * @apiNote Алгоритм поиска нужного числа последовательности Фибоначчи(без рекурсии, линейная сложность)
     */
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            final int[] numbers = new int[n];
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            return numbers[n - 1];
        }
    }
}

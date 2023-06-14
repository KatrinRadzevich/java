package org.example.Lesson2.HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int n = sc.nextInt();
        int resSum = 0;
        System.out.println("Введите числа последовательности: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (isSimple(num)) {
                resSum += num;
            }
        }
        System.out.println("resSum = " + resSum);
    }

    /**
     * @param number проверяемое число из последовательности
     * @return true/false
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     */
    public static boolean isSimple(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

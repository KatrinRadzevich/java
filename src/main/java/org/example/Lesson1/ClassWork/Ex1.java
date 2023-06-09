package org.example.Lesson1.ClassWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        System.out.println("task1(n) = " + task1(n));

    }

    /**
     * @param n входящее целочисленное значение
     * @return результат выполнения задачи
     * @apiNote Для заданного целого числа n верните разницу между произведением его цифр и суммой его цифр.
     */

    private static int task1(int n) {
        int multi = 1, sum = 0;
        while (n != 0) {
            multi *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}


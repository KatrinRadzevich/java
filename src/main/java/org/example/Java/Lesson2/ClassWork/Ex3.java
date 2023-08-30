package org.example.Java.Lesson2.ClassWork;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNums(n, sc));

    }

    /**
     * @param size длина последовательности чисел
     * @param in   ввод чисел последовательности
     * @return resSum сумма чисел, оканчивающихся на 5
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
     * // перед которыми идет четное число.
     */
    private static int sumNums(int size, Scanner in) {
        int resSum = 0;
        int firstNum = in.nextInt();
        for (int i = 1; i < size - 1; i++) {
            int secondNum = in.nextInt();
            if (secondNum % 10 == 5 && firstNum % 2 == 0) {
                resSum += secondNum;
            }
            firstNum = secondNum;
        }
        return resSum;
    }
}
package org.example.Java.Lesson2.HomeWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int n = sc.nextInt();
        System.out.println("Введите числа последовательности: ");
        System.out.println("ifRises = " + ifRises(n, sc));
    }

    /**
     * @param size длина последовательности
     * @param in   ввод чисел последовательности
     * @return true/false
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     */
    public static boolean ifRises(int size, Scanner in) {
        int firstNumber = in.nextInt();
        for (int i = 1; i < size; i++) {
            int secondNumber = in.nextInt();
            if (firstNumber > secondNumber) return false;
            firstNumber = secondNumber;
        }
        return true;
    }
}

package org.example.Java.Lesson1.HomeWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num1 = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int num2 = sc.nextInt();

            if (isNumberPositive(num1, num2)) {
                sum += num1;
            }
            num1 = num2;
        }
        System.out.println(sum);
    }

    /**
     * @param a previous number.
     * @param b next number.
     * @return sum
     * @apiNote To count the sum of positing num becomes a negative one
     */

    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}


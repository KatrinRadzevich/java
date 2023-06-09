package org.example.Lesson1.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num1 = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int num2 = sc.nextInt();

            if (isNumberPositive(num1, num2)) {
                count++;
            }
            num1 = num2;
        }
        System.out.println("count = " + count);
    }

    /**
     * @apiNote To count how much time positing num becomes a negative one
     * @param a previous number.
     * @param b next number.
     * @return count
     */

    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}
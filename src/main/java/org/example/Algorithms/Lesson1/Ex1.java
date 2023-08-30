package org.example.Algorithms.Lesson1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sum = getSum(sum, n);
        System.out.println("sum: " + sum);
    }

    /**
     * @param sum
     * @param n
     * @return sum
     * @apiNote Алгоритм,считающий сумму всех чисел от 1 до N.
     */
    public static int getSum(int sum, int n) {
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}

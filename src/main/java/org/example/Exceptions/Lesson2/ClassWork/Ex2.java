package org.example.Exceptions.Lesson2.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ex0();
    }

    public static void ex0() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, вкоторорый хотите присвоить значение 1: ");
        int index = scanner.nextInt();
        if (index < arr.length && index >= 0) {
            arr[index] = 1;
        } else {
            System.out.println("Указан индекс за пределами массива!");
        }
    }
}

package org.example.Algorithms.Lesson2.Arrays.ClassWork;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex1BubbleSort {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);
        Date startTime = new Date();
        bubbleSortArray(arr);
        Date endTime = new Date();
        printArray(arr);
        System.out.println("Time of working bubbleSortArray= " + (endTime.getTime() - startTime.getTime()));
    }

    /**
     * @param arr входящий массив
     * @return отсортированный массив
     * @apiNote алгоритм сортировки пузырьком
     */
    private static int[] bubbleSortArray(int[] arr) {
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);
        for (int j = 0; j < arr.length; j++) {

        }
        return arr;
    }

    /**
     * @param arr массив для печати
     * @apiNote красивая печать массива на экран
     */
    private static void printArray(int[] arr) {
        String result = "array = [";
        for (int element : arr) {
            result += " " + element + ",";
        }
        System.out.println(result.substring(0, result.length() - 1) + " ]");
    }

    /**
     * @param length размерность массива
     * @return массив
     * @apiNote подготовка массива случайных чисел
     */
    private static int[] prepareArray(int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }
}

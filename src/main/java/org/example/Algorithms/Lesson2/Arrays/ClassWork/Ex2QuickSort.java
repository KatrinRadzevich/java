package org.example.Algorithms.Lesson2.Arrays.ClassWork;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex2QuickSort {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);
        Date startTime = new Date();
        quickSortArray(arr, 0, arr.length - 1);
        Date endTime = new Date();
        printArray(arr);
        System.out.println("Time of working quickSortArray= " + (endTime.getTime() - startTime.getTime()));
    }

    /**
     * @param arr           входящий массив
     * @param startPosition начальная позиция
     * @param endPosition   конечная позиция
     * @return отсортированный массив
     * @apiNote алгоритм быстрой сортировки
     */
    private static int[] quickSortArray(int[] arr, int startPosition, int endPosition) {
        int pivot = arr[(startPosition + endPosition) / 2];
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int temp;
        do {
            while (arr[leftPosition] < pivot) {
                leftPosition++;
            }
            while (arr[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    temp = arr[leftPosition];
                    arr[leftPosition] = arr[rightPosition];
                    arr[rightPosition] = temp;
                }
                rightPosition--;
                leftPosition++;
            }
        } while (leftPosition <= rightPosition);
        if (rightPosition > startPosition) {
            quickSortArray(arr, startPosition, rightPosition);
        }
        if (leftPosition < endPosition) {
            quickSortArray(arr, leftPosition, endPosition);
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

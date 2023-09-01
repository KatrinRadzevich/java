package org.example.Algorithms.Lesson2.Arrays.ClassWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex3BinarySearch {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        System.out.println("binarySearch(7) = " + binarySearch(7, arr, 0, arr.length - 1));
    }

    /**
     * @param value значение поиска
     * @param arr   входной отсортированный массив
     * @param min
     * @param max
     * @return индекс искомого элемента
     * @apiNote алгоритм бинарного поиска
     */
    private static int binarySearch(int value, int[] arr, int min, int max) {
        int middle;
        if (max < min) {
            return -1;
        } else {
            middle = (max - min) / 2 + min;
        }
        if (arr[middle] < value) {
            return binarySearch(value, arr, middle + 1, max);
        } else {
            if (arr[middle] > value) {
                return binarySearch(value, arr, min, middle - 1);
            } else {
                return middle;
            }
        }
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
            result[i] = random.nextInt(10);
        }
        return result;
    }
}

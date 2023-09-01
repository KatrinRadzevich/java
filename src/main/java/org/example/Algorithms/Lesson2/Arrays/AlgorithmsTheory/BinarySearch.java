package org.example.Algorithms.Lesson2.Arrays.AlgorithmsTheory;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 2, 3, 7, 5, 6, 8};
        printArray(array);
        Arrays.sort(array);
        printArray(array);
        System.out.println("binarySearch(7) index = " + binarySearch(7, array, 0, array.length - 1));
    }

    /**
     * @param value значение поиска
     * @param arr   входной отсортированный массив
     * @param min
     * @param max
     * @return индекс искомого элемента
     * @apiNote алгоритм бинарного поиска O(log n)
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
}

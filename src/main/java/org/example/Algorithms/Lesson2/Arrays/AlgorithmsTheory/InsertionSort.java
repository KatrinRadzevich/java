package org.example.Algorithms.Lesson2.Arrays.AlgorithmsTheory;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 2, 3, 5, 6, 8};
        printArray(array);
        insertionSort(array);
        printArray(array);
    }

    /**
     * @param array входящий массив
     * @return отсортированный массив
     * @apiNote алгоритм сортировки вставками. O(n^2)
     */
    private static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
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

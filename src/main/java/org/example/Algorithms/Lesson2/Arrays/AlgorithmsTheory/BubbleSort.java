package org.example.Algorithms.Lesson2.Arrays.AlgorithmsTheory;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 2, 3, 5, 6, 8};
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }

    /**
     * @param array входящий массив
     * @return отсортированный массив
     * @apiNote алгоритм сортировки пузырьком. O(n)
     */
    private static int[] bubbleSort(int[] array) {
        boolean needSort;
        do {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = true;
                }
            }
        } while (needSort);
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

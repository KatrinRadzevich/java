package org.example.Algorithms.Lesson2.Arrays.HomeWork;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 2, 3, 5, 7, 20, 3, 56};
        printArray(array);
        printArray(heapSort(array));
    }

    /**
     * @param array входящий массив
     * @return отсортированный массив
     * @apiNote алгоритм сортировки кучей(пирамидальной). O(n * log n)
     */
    private static int[] heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        return array;
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            heapify(array, heapSize, largest);
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

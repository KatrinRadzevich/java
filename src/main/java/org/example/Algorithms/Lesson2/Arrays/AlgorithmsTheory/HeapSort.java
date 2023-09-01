package org.example.Algorithms.Lesson2.Arrays.AlgorithmsTheory;

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
        //Построение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        //Один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            //Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //Вызываем процедуру heapify на уменьшиной куче
            heapify(array, i, 0);
        }
        return array;
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; //Инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; //левый = 2 * rootIndex +1
        int rightChild = 2 * rootIndex + 2; //правый = 2 * rootIndex +2

        //Если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        //Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }
        //Если самый большой эленент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            //Рекурсивно преобразуем в двоичную кучу затронутое поддрево
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

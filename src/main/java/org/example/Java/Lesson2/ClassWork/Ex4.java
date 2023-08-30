package org.example.Java.Lesson2.ClassWork;

public class Ex4 {
    public static void main(String[] args) {
        int[] myArray = {3, 2, 4, 3, 2, 5, 3};
        System.out.println(countPairs(myArray));
    }

    /**
     * @param arr данный массив
     * @return count количество пар соседних элементов
     * @apiNote Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     */
    private static int countPairs(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] * 2 == arr[i]) {
                count += 1;
            }
        }
        return count;
    }
}

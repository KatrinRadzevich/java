package org.example.Java.Lesson2.HomeWork;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] myArray = {1, 99, 33, 44, 5, -5, -3, 23, -7, 101, -100, 12};
        System.out.println(Arrays.toString(myArray));
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= 10 && myArray[i] <= 99) {
                sum += i;
            }
        }
        System.out.println("sum of indexes of negative nums = " + sum);
        int[] newArray = changedArray(myArray, sum);
        System.out.println(Arrays.toString(newArray));
    }

    /**
     * @param array изначальный данный массив
     * @param sum   сумма индексов отрицательных чисел массива
     * @return массив с замененными элементами по условию
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     */
    public static int[] changedArray(int[] array, int sum) {

        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                array[j] = sum;
            }
        }
        return array;
    }
}


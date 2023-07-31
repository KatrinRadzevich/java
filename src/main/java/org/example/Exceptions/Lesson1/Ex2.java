package org.example.Exceptions.Lesson1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 0, 0, 9, 6};
        dialog(array);
    }

    private static void dialog(int[] array) {
        System.out.println("Введите искомое число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int code = checkArray(array, num);
        parseCode(code);
    }

    private static void parseCode(int code) {
        switch (code) {
            case -1 -> System.out.println("Длина массива меньше минимально-необходимого");
            case -2 -> System.out.println("Искомый элемент не найден");
            case -3 -> System.out.println("Массив не инициализирован");
            default -> System.out.println("Индекс элемента: " + code);
        }
    }

    private static int checkArray(int[] array, int num) {
        if (array == null) return -3;
        int minLength = 5;
        if (array.length < minLength) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) return i;
        }
        return -2;
    }
}

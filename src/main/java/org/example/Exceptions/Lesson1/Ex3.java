package org.example.Exceptions.Lesson1;

public class Ex3 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 0, 0}, {0, 5, 0}, {0, 0, 0}};
        while (true) {
            try {
                System.out.println("Сумма элементов массива = " + sumArrayItems(array));
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        System.out.println("Конец");
    }

    private static int sumArrayItems(int[][] array) {
        if (array == null) throw new RuntimeException("Массив пуст");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) throw new RuntimeException("Массив не квадратный");
            for (int j = 0; j < array[i].length; j++) {
                int item = array[i][j];
                if (item != 0 && item != 1)
                    throw new RuntimeException("Элемент под индексом [" + i + ", " + j + "] равен "
                            + item + ". Ожидается 0 или 1");
                sum += item;
            }
        }
        return sum;
    }
}

package org.example.Java.Lesson2.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(palindrom(myArray));
    }

    /**
     * @param arr
     * @return симметричный или нет
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     */
    private static String palindrom(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return "Не симметричный";
            }
        }
        return "Симметричный";
    }
}

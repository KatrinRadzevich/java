package org.example.Java.Lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};
        System.out.println(isDuble(arr));
    }

    /**
     * @param arr
     * @return true/false
     * @apiNote Определить, есть ли в массиве дубликаты, если найден хоть один, вывести true. В противном случае false
     */
    private static boolean isDuble(int[] arr) {
        Map<Integer, Integer> mapCh = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!mapCh.containsKey(arr[i])) {
                mapCh.put(arr[i], 1);
            } else {
                mapCh.put(arr[i], mapCh.get(arr[i]) + 1);
                return true;
            }
        }
        return false;
    }
}

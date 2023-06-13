package org.example.Lesson2.ClassWork;

// Дан массив целых чисел. нужно посчитать сумму
public class Ex2 {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 6, 9};
        int[] res = runningSum(myArray);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

    /**
     * @param nums данный массив
     * @return nums обработанный массив
     * @apiNote ввод: 1,2,3,4 вывод 1,3,6,10
     */
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

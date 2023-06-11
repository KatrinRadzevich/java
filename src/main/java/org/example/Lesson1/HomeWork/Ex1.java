package org.example.Lesson1.HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку. Например : the  sky is   blue :");
        String incomingString = sc.nextLine();
        System.out.println(reverseString(incomingString));
    }

    /**
     * @param incomingString
     * @return resultString(reversed)
     * @apiNote https://leetcode.com/problems/reverse-words-in-a-string/
     */
    private static String reverseString(String incomingString) {
        String[] a = incomingString.replaceAll("\\s+", " ").trim().split(" ");
        String resultString = "";
        int i = a.length - 1;
        while (i >= 0) {
            resultString += a[i] + " ";
            i--;

        }
        return resultString.trim();
    }
}

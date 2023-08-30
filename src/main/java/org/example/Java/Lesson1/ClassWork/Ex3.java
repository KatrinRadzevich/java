package org.example.Java.Lesson1.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newString = sc.nextLine();
        System.out.println("task3(newString) = " + task3(newString));

    }

    /**
     * @param newString исходная строка
     * @return subStr2 + subStr1 результирующая строка
     * @apiNote Дана строка. Поменять местами ее половины
     */
    private static String task3(String newString) {
        String subStr1 = newString.substring(0, newString.length() / 2);
        String subStr2 = newString.substring(newString.length() / 2);
        return subStr2 + subStr1;
    }
}
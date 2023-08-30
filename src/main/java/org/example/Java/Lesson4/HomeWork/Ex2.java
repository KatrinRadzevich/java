package org.example.Java.Lesson4.HomeWork;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку,например (){}[]<>: ");
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }

    /**
     * @param s string
     * @return true/false
     * @apiNote https://leetcode.com/problems/valid-parentheses/
     */
    public static boolean isValid(String s) {
        String opened = "({[<";
        String closed = ")}]>";
        ArrayDeque<Integer> openBracketsQue = new ArrayDeque<Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (opened.indexOf(s.charAt(i)) >= 0) {
                openBracketsQue.push(opened.indexOf(s.charAt(i)));
            } else if (closed.indexOf(s.charAt(i)) >= 0) {
                if (openBracketsQue.size() == 0) {
                    return false;
                } else if (openBracketsQue.pop() != closed.indexOf(s.charAt(i))) {
                    return false;
                }
            }
        }
        if (openBracketsQue.size() > 0) {
            return false;
        }
        return true;
    }
}


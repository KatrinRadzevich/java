package org.example.Algorithms.Lesson4.TreeStucture.HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final RedBlackTree redBlackTree = new RedBlackTree();
        Scanner scanner = new Scanner(System.in);
        int value = 1;
        while (value != 0) {
            value = scanner.nextInt();
            redBlackTree.add(value);
            System.out.println("finish");
        }

    }
}

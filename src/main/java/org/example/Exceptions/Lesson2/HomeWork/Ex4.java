package org.example.Exceptions.Lesson2.HomeWork;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        workingProcess();
    }

    private static void workingProcess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любые символы: ");
        String anything = scanner.nextLine().trim();
        if (!anything.equals("")) System.out.println(anything + "\nВсе сделано верно");
        else System.out.println("Пустой строка быть не может");
    }
}

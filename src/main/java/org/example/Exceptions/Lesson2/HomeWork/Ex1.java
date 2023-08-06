package org.example.Exceptions.Lesson2.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        workingProcess();
    }

    /**
     * @apiNote Проверяет результат введенных данных от пользователя и заканчивает работу,либо запрашивает ввод снова
     */
    private static void workingProcess() {
        System.out.println("Приложение начинает работу...");
        while (!inputValue()) {
            System.out.println("Введен неверный формат,попробуйте снова");
        }
        System.out.println("Выполнено успешно");
    }

    /**
     * @return true/false
     * @apiNote Запрашивает у пользователя число типа float. Если введенное не соответствует типу возвращает false,если все верно - true
     */
    private static boolean inputValue() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число типа float(верный формат 3,5): ");
            Float number = scanner.nextFloat();
            System.out.println(number);
        } catch (InputMismatchException e) {
            return false;
        }
        return true;
    }
}

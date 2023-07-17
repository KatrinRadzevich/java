package org.example.OOP.Lesson3.ClassWork.Ex3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.logp(Level.INFO, "Main", "psvm", " game started");
        Scanner scanner = new Scanner(System.in);
        gamingProcess(scanner, log);
        log.logp(Level.INFO, "Main", "psvm", "game finished");
    }

    /**
     * @param scanner сканнер
     * @param log     лог
     * @apiNote Игровой процесс с механикой меню выбора типа игры,логированием каждой попытки,выводом истории игры
     */
    public static void gamingProcess(Scanner scanner, Logger log) {
        StringBuilder gameHistory = new StringBuilder();
        System.out.println("Есть 3 варианта игры, введите номер пункта выбранного варианта:\n1.числовая игра, 2.игра на английском, 3. игра на русском");
        int gameVariant = scanner.nextInt();
        if (gameVariant == 1) {
            NumberGame numberGame = new NumberGame();
            System.out.println("Введите длину слова и максимальное количество попыток угадывания: ");
            numberGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = numberGame.inputValue(value);
                if (answer != null) {
                    System.out.println("answer = " + answer);
                    log.info("your try is successful");
                    gameHistory.append("\n").append(answer);
                }
            }
        }

        if (gameVariant == 2) {
            EnglishGame englishGame = new EnglishGame();
            System.out.println("Введите длину слова и максимальное количество попыток угадывания: ");
            englishGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!englishGame.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = englishGame.inputValue(value);
                if (answer != null) {
                    System.out.println("answer = " + answer);
                    log.info("your try is successful");
                    gameHistory.append("\n").append(answer);
                }
            }
        }
        if (gameVariant == 3) {
            RussianGame russianGame = new RussianGame();
            System.out.println("Введите длину слова и максимальное количество попыток угадывания: ");
            russianGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!russianGame.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = russianGame.inputValue(value);
                if (answer != null) {
                    System.out.println("answer = " + answer);
                    log.info("your try is successful");
                    gameHistory.append("\n").append(answer);
                }
            }
        }
        System.out.println("Хотите вывести историю игры? 1 - да, 2 - нет: ");
        int printHistory = scanner.nextInt();
        if (printHistory == 1) System.out.println("gameHistory: " + gameHistory);
    }
}
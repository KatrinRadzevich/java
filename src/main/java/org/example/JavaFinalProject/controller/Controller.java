package org.example.JavaFinalProject.controller;

import org.example.JavaFinalProject.model.PopularToys;
import org.example.JavaFinalProject.model.RareToys;
import org.example.JavaFinalProject.model.Toys;
import org.example.JavaFinalProject.model.Type;
import org.example.JavaFinalProject.service.UserService;
import org.example.JavaFinalProject.view.UserView;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    private final UserService userService = new UserService();
    private final UserView userView = new UserView();

    private List<Toys> chosenToysToGet;
    private Scanner scanner = new Scanner(System.in);

    public void createToy(Type type, Integer toyId, String toyName, Integer toyQuantity, Double toyWeight) {
        userService.create(type, toyId, toyName, toyQuantity, toyWeight);
    }

    public void createPoplarToy(Integer toyId, String toyName, Integer toyQuantity, Double toyWeight) {
        userService.create(Type.POPULAR, toyId, toyName, toyQuantity, toyWeight);
    }

    public void createRareToy(Integer toyId, String toyName, Integer toyQuantity, Double toyWeight) {
        userService.create(Type.RARE, toyId, toyName, toyQuantity, toyWeight);
    }

    /**
     * @apiNote Печать всех игрушек
     */

    public void getAllToys() {
        List<Toys> toys = userService.readAllToys();
        for (Toys toy : toys) {
            userView.printAllToys(toy);
        }
    }

    /**
     * @apiNote Печать только популярных игрушек
     */

    public void getPopularToys() {
        List<PopularToys> popularToys = userService.readOnlyPopularToys();
        for (PopularToys popularToy : popularToys) {
            userView.printPopularToys(popularToy);
        }
    }

    /**
     * @apiNote Печать только редких игрушек
     */

    public void getRareToys() {
        List<RareToys> rareToys = userService.readOnlyRareToys();
        for (RareToys rareToy : rareToys) {
            userView.printRareToys(rareToy);
        }
    }

    /**
     * @apiNote Меню для проведения розыгрыша с учетом ввода невалидных данных
     */
    public void prizeMachineStart() {
        System.out.println("\n\nWelcome to our prizeMachine menu! Check out what we have today:\n");
        getAllToys();
        System.out.println("\nCheck your luck! Firstly my system will choose one of the categories from which you can choose your new toy\nInput 1 to continue or 2 to finish: ");
        String menuNumber = scanner.next();
        if (Integer.valueOf(menuNumber).equals(1)) {
            System.out.println("\nLet's see how lucky you are today...");
            choiceOfTheToy();
            toyGetting();
        }
        if (Integer.valueOf(menuNumber).equals(2)) {
            System.out.println("Ok, have a good day! :)");
        }
        if (!Integer.valueOf(menuNumber).equals(1) && !Integer.valueOf(menuNumber).equals(2)) {
            System.out.println("Something went wrong... Try again later");
        }
        System.out.println("Thank you for the play :)");
    }

    /**
     * @return категорию игрушки(редкая или популярная)
     * @apiNote Рандомный выбор категории игрушки машиной для розыгрыша
     */
    public String getRandomCategory() {
        System.out.println("Random generation is in the process.... ");
        Random random = new Random();
        int randomNumber = random.nextInt(1, 3);
        System.out.print("Random category for you is... ");
        if (randomNumber == 1) {
            System.out.println("Congrats!!! You are lucky today! Your category is RARE toys,choose one of them :)");
            getRareToys();
            return "RareToy";
        }
        if (randomNumber == 2) {
            System.out.print("popular toys,choose one of them :)\n");
            getPopularToys();
            return "PopularToy";
        }
        return null;
    }

    /**
     * @return id игрушки или запись,что такой игрушки нет
     * @apiNote Предоставление выбора игрушки по ее id,с проверкой на валидность введенных данных
     */
    public String choiceId() {
        System.out.println("\nInput please the toyId that you have chosen: ");
        Integer toyNumber = scanner.nextInt();
        List<Toys> toys = userService.readAllToys();
        for (Toys toy : toys) {
            if (toyNumber == toy.getToyId()) {
                return toyNumber.toString();
            }
        }
        return "My system doesn't have such index :( Try again later.";
    }

    /**
     * @apiNote Требуемый метод  выбора игрушки по условию. Использует введенный id игрушки, чтобы записать выбранную игрушку в массив "на выдачу"
     */
    public void choiceOfTheToy() {
        String toyType = getRandomCategory();
        List<Toys> chosenToys = new ArrayList<>();
        Integer toyNumber = Integer.valueOf(choiceId());

        if (toyType.equals("RareToy")) {
            List<RareToys> rareToys = userService.readOnlyRareToys();
            for (RareToys rareToy : rareToys) {
                if (toyNumber == rareToy.getToyId()) {
                    chosenToys.add(rareToy);
                    chosenToysToGet = chosenToys;
                }
            }
        }
        if (toyType.equals("PopularToy")) {
            List<PopularToys> popularToys = userService.readOnlyPopularToys();
            for (PopularToys popularToy : popularToys) {
                if (toyNumber == popularToy.getToyId()) {
                    chosenToys.add(popularToy);
                    chosenToysToGet = chosenToys;
                }
            }
        }
    }

    /**
     * @apiNote Изменение количества доступных игрушек после розыгрыша
     */
    private void changeQuantity() {
        List<Toys> toys = userService.readAllToys();
        for (Toys toy : toys) {
            for (Toys toys1 : chosenToysToGet) {
                if (toy.equals(toys1)) {
                    Integer oldQuantity = toy.getToyQuantity();
                    toy.setToyQuantity(oldQuantity - 1);
                    System.out.println("\n\nAll toys that are available:");
                    getAllToys();
                }
            }
        }
    }

    /**
     * @apiNote Требуемый по условию метод получения игрушек и записи информации о ней в файл "toyGetting.txt"
     */
    public void toyGetting() {
        List<Toys> chosenToys = chosenToysToGet;
        String fileName = "toyGetting.txt";
        changeQuantity();
        try (FileWriter writer = new FileWriter(fileName);) {
            for (Toys chosenToy : chosenToys) {
                chosenToy.setToyQuantity(1);
                writer.write(chosenToy + "\n");
                System.out.println("\nCongrats!!! You got your prize toy :D \nYou can check all information about you toy on its card named toyGetting.txt");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




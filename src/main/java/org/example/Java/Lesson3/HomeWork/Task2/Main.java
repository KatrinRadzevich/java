package org.example.Java.Lesson3.HomeWork.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Получить наименования товаров заданного сорта с наименьшей ценой.
public class Main {
    public static void main(String[] args) {
        List<Veggies> veggiesList = create();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемый сорт(1/2): ");
        int sc = scanner.nextInt();
        for (Veggies veggies : veggiesList) {
            if (veggies.getPrice().equals(isMin(sc, veggiesList))) {
                System.out.println("veggies.getName() with minimal price= " + veggies.getName());
            }
        }
    }

    /**
     * @return veggiesList
     * @apiNote заполнение
     */
    public static List<Veggies> create() {
        List<Veggies> veggiesList = new ArrayList<>();
        veggiesList.add(new Veggies("Картофель", "Беларусь", 800, 1, 1));
        veggiesList.add(new Veggies("Лук", "Вьетнам", 100, 3, 2));
        veggiesList.add(new Veggies("Морковь", "Россия", 800, 1, 1));
        veggiesList.add(new Veggies("Сельдерей", "Болгария", 1_000, 3, 2));
        veggiesList.add(new Veggies("Капуста", "Беларусь", 800, 2, 1));
        veggiesList.add(new Veggies("Батат", "Вьетнам", 100, 3, 2));
        veggiesList.add(new Veggies("Баклажан", "Беларусь", 800, 5, 1));
        veggiesList.add(new Veggies("Кабачок", "Вьетнам", 100, 6, 2));


        return veggiesList;
    }

    /**
     * @param sc          сканер
     * @param veggiesList коллекция
     * @return minPrice найденное значение минимальной суммы
     * @apiNote поиск минимальной суммы с учетом выбранного сорта
     */
//    недовольна этим методом,но лучше не придумала
    public static Integer isMin(Integer sc, List<Veggies> veggiesList) {
        Integer minPrice = 0;
        Integer maxPrice = 0;
        for (Veggies veggies : veggiesList) {
            if (veggies.getKind().equals(sc)) {
                Integer somePrice = veggies.getPrice();
                if (minPrice == 0 && maxPrice == 0) {
                    minPrice = somePrice;
                    maxPrice = somePrice;
                }
                if (minPrice > somePrice) {
                    minPrice = somePrice;
                }
                if (maxPrice < somePrice) {
                    maxPrice = somePrice;
                }
            }
        }
        return minPrice;
    }
}



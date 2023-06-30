package org.example.Lesson6.HomeWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = create();
        Scanner sc = new Scanner(System.in);
        menu(sc, laptops);
    }

    /**
     * @return laptops множество всех ноутбуков со всеми характеристиками
     * @apiNote Структура класса Ноутбук
     */
    public static List<Laptop> create() {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Lenovo", "ideapad320", 8, "Windows", "gray", 3.20, 400));
        laptops.add(new Laptop("Lenovo", "ideapad312", 12, "Windows", "white", 3.50, 480));
        laptops.add(new Laptop("TOSHIBA", "setelite c660", 16, "Windows", "gray", 4.30, 500));
        laptops.add(new Laptop("Apple MacBook", "air13", 12, "MAC", "black", 2.80, 500));
        laptops.add(new Laptop("Apple MacBook", "air14", 8, "MAC", "green", 3.10, 420));
        laptops.add(new Laptop("Asus", "VivoBook 15 M1502I", 16, "Linux", "yellow", 4.80, 400));
        laptops.add(new Laptop("Asus", "M1502IA-BQ093", 8, "Linux", "white", 3.70, 380));
        laptops.add(new Laptop("Lenovo", "ideapad320-33", 8, "Windows", "black", 3.50, 480));
        laptops.add(new Laptop("Lenovo", "ideapad312-22", 12, "Windows", "black", 3.70, 400));
        laptops.add(new Laptop("TOSHIBA", "setelite c660-11", 16, "Windows", "white", 4.80, 400));
        laptops.add(new Laptop("Apple MacBook", "air13-33", 12, "MAC", "white", 2.80, 500));
        laptops.add(new Laptop("Apple MacBook", "air14-22", 8, "MAC", "yellow", 3.10, 520));
        laptops.add(new Laptop("Asus", "VivoBook 15 M1502I-11", 16, "Linux", "green", 4.30, 400));
        laptops.add(new Laptop("Asus", "M1502IA-BQ093-33", 8, "Linux", "black", 3.20, 380));
        return laptops;
    }

    /**
     * @param sc      сканнер
     * @param laptops множество всех ноутбуков со всеми характеристиками
     * @apiNote Интерактивное пользовательское меню для выбора фильтрации или выборки
     */
    private static void menu(Scanner sc, List<Laptop> laptops) {
        System.out.println("Выберите пункт меню:\n1 - выборка по 1 критерию\n2 - фильтрация по 4 критериям\nВаш выбор: ");
        String size = sc.nextLine();
        if (size.equals("1")) {
            ChoiceByOneCriteria(laptops, createCriteriaMap(sc));
        }
        if (size.equals("2")) {
            filtration(laptops, createFiltersMap(sc));
        }
    }

    /**
     * @param sc сканнер
     * @apiNote Зарпашивает у пользователя 1 критерий с желаемым значением и сохраняет его в MAP для дальнейшей выборки по 1 критерию
     */
    private static Map<Integer, String> createCriteriaMap(Scanner sc) {
        Map<Integer, String> criteriaMap = new HashMap<>();
        System.out.println("1 - ОЗУ\n2 - вес\n3 - ОС\n4 - цвет\n5 - название\n6 - цена\nВведите цифру критерия: ");
        String keyValue = sc.nextLine();
        if (keyValue.equals("1")) {
            System.out.println("Введите желаемое значение ОЗУ: ");
            String minValue = sc.nextLine();
            criteriaMap.put(1, minValue);
        }
        if (keyValue.equals("2")) {
            System.out.println("Введите желаемый вес: ");
            String minValue = sc.nextLine();
            criteriaMap.put(2, minValue);
        }
        if (keyValue.equals("3")) {
            System.out.println("Введите желаемую операционную систему: ");
            String minValue = sc.nextLine().toLowerCase();
            criteriaMap.put(3, minValue);
        }
        if (keyValue.equals("4")) {
            System.out.println("Введите желаемый цвет: ");
            String minValue = sc.nextLine().toLowerCase();
            criteriaMap.put(4, minValue);
        }
        if (keyValue.equals("5")) {
            System.out.println("Введите желаемое название фирмы ноутбука: ");
            String minValue = sc.nextLine().toLowerCase();
            criteriaMap.put(5, minValue);
        }
        if (keyValue.equals("6")) {
            System.out.println("Введите желаемую цену: ");
            String minValue = sc.nextLine().toLowerCase();
            criteriaMap.put(6, minValue);
        }
        return criteriaMap;
    }

    /**
     * @param laptops     множество всех ноутбуков со всеми характеристиками
     * @param criteriaMap map из 1 критерия для выборки среди множества ноутбуков
     * @apiNote Печатает выборку подходящих позиций по 1 критерию от пользователя
     */
    private static void ChoiceByOneCriteria(List<Laptop> laptops, Map<Integer, String> criteriaMap) {
        for (Laptop laptop : laptops) {
            if (criteriaMap.containsKey(1) && laptop.getRamGb().toString().equals(criteriaMap.get(1))) {
                System.out.println("laptop = " + laptop);
            }
            if (criteriaMap.containsKey(2) && laptop.getWeightKg().toString().equals(criteriaMap.get(2))) {
                System.out.println("laptop = " + laptop);
            }
            if (criteriaMap.containsKey(3) && laptop.getOs().toLowerCase().equals(criteriaMap.get(3))) {
                System.out.println("laptop = " + laptop);
            }
            if (criteriaMap.containsKey(4) && laptop.getColour().toLowerCase().equals(criteriaMap.get(4))) {
                System.out.println("laptop = " + laptop);
            }
            if (criteriaMap.containsKey(5) && laptop.getName().toLowerCase().equals(criteriaMap.get(5))) {
                System.out.println("laptop = " + laptop);
            }
            if (criteriaMap.containsKey(6) && laptop.getPriceDollars().toString().equals(criteriaMap.get(6))) {
                System.out.println("laptop = " + laptop);
            }
        }
    }

    /**
     * @param sc сканнер
     * @apiNote Зарпашивает у пользователя желаемые значения по 4 фильтрам и сохраняет их в MAP для дальнейшей фильтрации по этим 4 показателям
     */
    private static Map<Integer, String> createFiltersMap(Scanner sc) {
        Map<Integer, String> filtersMap = new HashMap<>();
        Integer filters = 4;
        while (filters > 0) {
            System.out.println("1 - ОЗУ, 2 - вес,3 - ОС, 4 - цвет, Введите цифру критерия: ");
            String keyValue = sc.nextLine();
            if (keyValue.equals("1")) {
                System.out.println("Введите желаемое значение ОЗУ: ");
                String minValue = sc.nextLine();
                filtersMap.put(1, minValue);
            }
            if (keyValue.equals("2")) {
                System.out.println("Введите желаемый вес: ");
                String minValue = sc.nextLine();
                filtersMap.put(2, minValue);
            }
            if (keyValue.equals("3")) {
                System.out.println("Введите желаемую операционную систему: ");
                String minValue = sc.nextLine().toLowerCase();
                filtersMap.put(3, minValue);
            }
            if (keyValue.equals("4")) {
                System.out.println("Введите желаемый цвет: ");
                String minValue = sc.nextLine().toLowerCase();
                filtersMap.put(4, minValue);
            }
            filters--;
        }
        return filtersMap;
    }

    /**
     * @param laptops    множество всех ноутбуков со всеми характеристиками
     * @param filtersMap map из 4 фильтров для отфильтрованного вывода среди множества ноутбуков
     * @apiNote Печатает подходящие позиции по указанным показателям
     */
    private static void filtration(List<Laptop> laptops, Map<Integer, String> filtersMap) {
        for (Laptop laptop : laptops) {
            if (filtersMap.containsKey(1) && filtersMap.containsKey(2) && filtersMap.containsKey(3) && filtersMap.containsKey(4)) {
                if ((laptop.getRamGb().toString().equals(filtersMap.get(1))) && (laptop.getWeightKg().toString().equals(filtersMap.get(2))) && (laptop.getOs().toLowerCase().equals(filtersMap.get(3))) && (laptop.getColour().toLowerCase().equals(filtersMap.get(4)))) {
                    System.out.println("laptop = " + laptop);
                }
            }
        }
    }
}



package org.example.OOP.Lesson1.HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Print extends Main {
    /**
     * @param categoryMap
     * @apiNote printing a categoryMap
     */
    public static void printCategoryMap(Map<Category, ArrayList<String>> categoryMap) {
        System.out.println("All items in the shop divided into categories: ");
        for (Map.Entry<Category, ArrayList<String>> entry : categoryMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(" ");
    }

    /**
     * @param users
     * @apiNote printing usersList
     */
    public static void printUsers(List<User> users) {
        System.out.println("Information about shopping");
        for (User user : users) {
            System.out.println("user: " + user);
        }
        System.out.println(" ");
    }

    /**
     * @param items
     * @apiNote printing itemsList
     */
    public static void printItemsWithoutCategory(List<Shop> items) {
        System.out.println("All items in the shop without categories: ");
        for (Shop item : items) {
            System.out.println(item);
        }
        System.out.println(" ");
    }

    /**
     * @param users
     * @param items
     * @apiNote Updates of availability in the shop
     */
    public static void updatesAvailability(List<User> users, List<Shop> items) {
        for (User user : users) {
            for (Shop item : items) {
                if (user.getName().equals(item.getName())) {
                    item.setAvailability(item.availability - user.boughtItems);
                }
            }
        }
    }

    /**
     * @param items
     * @param category1
     * @param category2
     * @return categoryMap
     * @apiNote Dividing list of items into different ArrayLists and making a map with the Key(name of the category) and Value(ArrayList with items)
     */
    public static Map<Category, ArrayList<String>> createCategoryMap(List<Shop> items, Category category1, Category category2) {
        ArrayList<String> myListBeds = new ArrayList<>();
        ArrayList<String> myListToys = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().contains("bed")) {
                myListBeds.add(String.valueOf(item));
            }
            if (item.getName().contains("toy")) {
                myListToys.add(String.valueOf(item));
            }
        }
        Map<Category, ArrayList<String>> categoryMap = new HashMap<>();
        categoryMap.putIfAbsent(category1, myListBeds);
        categoryMap.putIfAbsent(category2, myListToys);

        return categoryMap;
    }
}

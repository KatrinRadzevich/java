package org.example.OOP.Lesson1.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.example.OOP.Lesson1.HomeWork.Print.*;

public class Main {
    public static void main(String[] args) {
        List<Shop> items = createItemsList();
        Category category1 = new Category("BEDS");
        Category category2 = new Category("TOYS");
        Map<Category, ArrayList<String>> categoryMapBeforeShopping = createCategoryMap(items, category1, category2);
        List<User> users = createUsersList();

        System.out.println("Information before shopping");
        printCategoryMap(categoryMapBeforeShopping);
        printItemsWithoutCategory(items);

        printUsers(users);
        System.out.println("Information after shopping");
        updatesAvailability(users, items);
        Map<Category, ArrayList<String>> categoryMap2AfterShopping = createCategoryMap(items, category1, category2);
        printCategoryMap(categoryMap2AfterShopping);
        printItemsWithoutCategory(items);
    }

    public static List<Shop> createItemsList() {
        List<Shop> items = new ArrayList<>();
        items.add(new Shop("Cats bed", 20.40, 5, 10));
        items.add(new Shop("Dogs bed", 30.40, 4, 10));
        items.add(new Shop("Cats toy1", 3.80, 3, 10));
        items.add(new Shop("Cats toy2", 5.40, 4, 10));

        return items;
    }

    public static List<User> createUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("kate@bk.ru", "123321a", "Dogs bed", 5));
        users.add(new User("kate@bk.ru", "123321a", "Cats toy1", 2));
        users.add(new User("yohgj@mail.ru", "33333asd", "Dogs bed", 1));
        users.add(new User("kate@bk.ru", "123321a", "Cats toy2", 4));

        return users;
    }
}



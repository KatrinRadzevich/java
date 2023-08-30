package org.example.Java.Lesson3.HomeWork.Task1;

import java.util.ArrayList;
import java.util.List;

//Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
public class Main {
    public static void main(String[] args) {
        List<Goods> goodsList = create();
        Integer maxPrice = 0;
        for (Goods goods : goodsList) {
            if (goods.getName().contains("высший") && (goods.getQuality().equals(1) || goods.getQuality().equals(2))) {
                Integer somePrice = goods.getPrice();
                if (maxPrice < somePrice) {
                    maxPrice = somePrice;
                }
            }
        }
        System.out.println("maxPrice = " + maxPrice);
    }

    public static List<Goods> create() {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("Абрикос, высший сорт", 5, 1));
        goodsList.add(new Goods("Апельсин, высший сорт", 13, 3));
        goodsList.add(new Goods("Арбуз, местный", 4, 2));
        goodsList.add(new Goods("Персик, высший сорт", 6, 2));
        goodsList.add(new Goods("Питая, высший сорт", 12, 1));
        goodsList.add(new Goods("Личи, местный", 9, 1));

        return goodsList;
    }
}


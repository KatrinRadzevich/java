package org.example.Lesson3.ClassWork.Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

// - количество деревянных кубиков с ребром 3 см
//- количество кубиков желтого цвета и их суммарный объем;
public class Main {
    public static void main(String[] args) {
        List<Cube> cubes = create();
        int quantityWooden = 0;
        int quantityOfYellow = 0;
        int volumeOfYellow = 0;
//        cubes.iter + Tab
        for (Cube cube : cubes) {
            if (cube.getMaterial().equals("wooden") && cube.getSizeSm() == 3) {
                quantityWooden++;
            }
            if (cube.getColour().equals("yellow")) {
                quantityOfYellow++;
                volumeOfYellow += cube.cubeVolume();
            }

        }
        System.out.println("quantityWooden = " + quantityWooden);
        System.out.println("quantityOfYellow = " + quantityOfYellow);
        System.out.println("volumeOfYellow = " + volumeOfYellow);
        System.out.println("cubes = " + cubes);
        System.out.println("uniqCollection(cubes) = " + uniqCollection(cubes));
    }



    public static List<Cube> create() {
        List<Cube> cubes = new ArrayList<>();
        cubes.add(new Cube(3, "red", "wooden"));
        cubes.add(new Cube(3, "yellow", "wooden"));
        cubes.add(new Cube(5, "red", "wooden"));
        cubes.add(new Cube(6, "yellow", "iron"));
        cubes.add(new Cube(3, "yellow", "wooden"));
        cubes.add(new Cube(6, "yellow", "iron"));
        cubes.add(new Cube(3, "yellow", "wooden"));

        return cubes;
    }
    //Напишите метод, который на вход получает коллекцию объектов,
// а возвращает коллекцию уже без дубликатов.
    private static Collection uniqCollection(List<Cube> cubes) {
        return new HashSet<>(cubes);
    }
}


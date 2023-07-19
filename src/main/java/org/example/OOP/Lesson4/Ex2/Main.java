package org.example.OOP.Lesson4.Ex2;

public class Main {
    public static void main(String[] args) {
        BoxWithNumbers<Integer> boxWithNumbers = new BoxWithNumbers(1, 2, 3, 4);
        BoxWithNumbers<Double> boxWithNumbers2 = new BoxWithNumbers(1, 2, 3);
        System.out.println("boxWithNumbers.average() = " + boxWithNumbers.average());
        System.out.println("boxWithNumbers.compareAverage(boxWithNumbers2) = " + boxWithNumbers.compareAverage(boxWithNumbers2));
    }
}

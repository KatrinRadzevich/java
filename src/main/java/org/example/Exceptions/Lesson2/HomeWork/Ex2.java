package org.example.Exceptions.Lesson2.HomeWork;

public class Ex2 {
    public static void main(String[] args) {
        try {
            Integer[] intArray = new Integer[5];
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
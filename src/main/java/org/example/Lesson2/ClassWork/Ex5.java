package org.example.Lesson2.ClassWork;

public class Ex5 {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2, 3);
        System.out.println("vector.vectorLenght() = " + vector.vectorLenght());
        Vector vector2 = new Vector(1, 1, 1);
        System.out.println("vector.scalar(vector2) = " + vector.scalar(vector2));
        System.out.println("vector.vectorMulti(vector2) = " + vector.vectorMulti(vector2));
        System.out.println("vector.kosVector(vector2) = " + vector.kosVector(vector2));
        System.out.println("vector.vectorPlus(vector2) = " + vector.vectorPlus(vector2));
        System.out.println("vector.vectorMinus(vector2) = " + vector.vectorMinus(vector2));
        System.out.println(vector);
    }
}

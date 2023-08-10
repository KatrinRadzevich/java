package org.example.Exceptions.Lesson3.ClassWork.Ex5;

public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(int i, int j) {
        super("Проблемный элемент тнаходится под индексом: " + "[" + i + "," + j + "]");
    }
}

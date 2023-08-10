package org.example.Exceptions.Lesson3.ClassWork.Ex3;

import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
            counter.close();
            counter.add();
            System.out.println(counter.isClosed());
            System.out.println(counter.getCount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

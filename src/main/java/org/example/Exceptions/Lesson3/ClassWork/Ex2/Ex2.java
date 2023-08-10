package org.example.Exceptions.Lesson3.ClassWork.Ex2;

import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        try{
        doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doSomething() throws IOException{
        throw new IOException();
    }
}

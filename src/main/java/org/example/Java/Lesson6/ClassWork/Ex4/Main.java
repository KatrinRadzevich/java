package org.example.Java.Lesson6.ClassWork.Ex4;

public class Main {
    public static void main(String[] args) {
        double temp = 0.0;
        System.out.println("temp C = " + new Celsii().convertValue(temp));
        System.out.println("temp Kelvin = " + new Kelvin().convertValue(temp));
        System.out.println("temp Far = " + new Farengheit().convertValue(temp));
    }
}

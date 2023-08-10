package org.example.Exceptions.Lesson3.ClassWork.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        try {
            System.out.println(divideTwo(6, 0));
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }
    public static double divideTwo(int num1, int num2) {
        if (num2 == 0) throw new DivisionByZeroException("На ноль делить нельзя!");
        return num1/num2;
    }
}

package org.example.Algorithms.Lesson1;

import java.util.Date;

public class Ex6 {
    public static void main(String[] args) {
        for (int i = 10; i <= 50 ; i+= 10) {
            System.out.println("\n \n текущий шаг = " + i + "\n ----------------------- \n");

            Date startDate = new Date();
            Ex4.fib(i);
            Date endDate = new Date();
            long recursDuration = endDate.getTime() - startDate.getTime();
            System.out.println("recursDuration = " + recursDuration);

            Date startDateLin = new Date();
            Ex5.fib(i);
            Date endDateLin = new Date();
            long recursDurationLin = endDateLin.getTime() - startDateLin.getTime();
            System.out.println("recursDurationLin = " + recursDurationLin);
        }
    }
}

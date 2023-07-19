package org.example.OOP.Lesson4.Ex2;

import lombok.Data;

@Data
public class BoxWithNumbers<E extends Number> {
    private E[] num;

    public BoxWithNumbers(E... num) {
        this.num = num;
    }

    public double average() {
        double result = 0;
        for (int i = 0; i < num.length; i++) {
            result += num[i].doubleValue();
        }
        return result / num.length;
    }

    public boolean compareAverage(BoxWithNumbers<?> boxWithNumbers2) {
        return (average() == boxWithNumbers2.average());
     }
}

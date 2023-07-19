package org.example.OOP.Lesson4.Ex1;

public class Main {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        Integer sum = ((Integer)intBox1.getObj()) + ((Integer)intBox2.getObj());
        System.out.println("sum = " + sum);
        intBox1.setObj("10");
        Integer sum2 = 0;
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer){
            sum2 = ((Integer)intBox1.getObj()) + ((Integer)intBox2.getObj());
            System.out.println("sum2 = " + sum2);
        }
        System.out.println("sum2 = " + sum2);
        GenBox<Integer> gen = new GenBox(10);
        GenBox<Integer> gen2 = new GenBox(20);
        Integer sum01 = gen.getObj()+ gen2.getObj();
        System.out.println("sum01  = " + sum01 );
    }
}

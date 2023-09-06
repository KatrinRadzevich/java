package org.example.Algorithms.Lesson3.LinkedList.ClassWork;

public class Main {
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.addFirst(0);
//        linkedList.addFirst(1);
//        linkedList.addFirst(2);
//        linkedList.addLast(7);
//        linkedList.addLast(8);
//        linkedList.addLast(9);
//        linkedList.print();
        TwoLinkedList list = new TwoLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(7);
        list.addFirst(3);
        list.addFirst(0);
        list.addFirst(4);
        list.print();
        System.out.println("\n------------");
        list.bubbleSort();
        list.print();
    }
}

package org.example.Lesson4.HomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("myList = " + myList);
        System.out.println("reverseLinkedList(myList) = " + reverseLinkedList(myList));
        System.out.println("reverseLinkedList2(myList) = " + reverseLinkedList2(myList));
    }

    /**
     * @param mylist
     * @return reverced LinkedList
     * @apiNote переворот 1 способ
     */
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> mylist) {
        for (int i = 0; i < mylist.size() / 2; i++) {
            Integer temp = mylist.get(i);
            mylist.set(i, mylist.get(mylist.size() - i - 1));
            mylist.set(mylist.size() - i - 1, temp);
        }
        return mylist;
    }

    /**
     * @param mylist
     * @return reverced LinkedList
     * @apiNote переворот 2 способ
     */
    public static LinkedList<Integer> reverseLinkedList2(LinkedList<Integer> mylist) {
        Collections.reverse(mylist);
        return mylist;
    }
}


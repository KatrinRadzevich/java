package org.example.Algorithms.Lesson3.LinkedList.LinkedListsTheory;

public class Stack {
    Node head;

    /**
     * @param value значение для добавления
     * @apiNote добавление элемента вначало списка
     */
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    /**
     * @return извлеченные данные
     * @apiNote извлечение данных сначала списка
     */
    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public class Node {
        int value;
        Node next;
    }
}

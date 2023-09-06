package org.example.Algorithms.Lesson3.LinkedList.LinkedListsTheory;

public class Queue {
    Node head;
    Node tail;

    /**
     * @param value значение для добавления
     * @apiNote добавление элемента вначало списка
     */
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;
        head = node;
    }

    /**
     * @return извлеченные данных сконца
     * @apiNote извлечение данных сконца
     */
    public Integer peek() {
        Integer result = null;
        if (tail != null) {
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }

    public class Node {
        int value;
        Node next;
        Node previous;
    }
}

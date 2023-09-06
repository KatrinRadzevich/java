package org.example.Algorithms.Lesson3.LinkedList.ClassWork;

public class LinkedList {
    private Node head;

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    /**
     * @apiNote удаление элемента вконце
     */
    public void removeLast(int value) {
        if (head != null) {
            Node current1 = head;
            while (current1.next != null) {
                if (current1.next.next == null) {
                    current1.next = null;
                }
                current1 = current1.next;
            }
            head = null;
        }
    }

    /**
     * @apiNote добавление элемента вконец
     */
    public void addLast(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        }
        Node current1 = head;
        while (current1.next != null) {
            current1 = current1.next;
        }
        current1.next = newNode;
    }

    /**
     * @apiNote проверка наличия элемента
     */
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * @apiNote добавление элемента вначало
     */
    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    /**
     * @apiNote удаление элемента сначала
     */
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    private class Node {
        private Node next;
        private int value;
    }
}

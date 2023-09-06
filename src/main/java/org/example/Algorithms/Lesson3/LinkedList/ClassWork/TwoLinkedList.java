package org.example.Algorithms.Lesson3.LinkedList.ClassWork;

public class TwoLinkedList {
    private Node head;
    private Node tail;

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
        if (tail != null) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            head = null;
            tail = null;
        }
    }

    /**
     * @apiNote добавление элемента вконец
     */
    public void addLast(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        newNode.prev = null;
        if (tail == null) {
            head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
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
        if (head != null) { // head(1) <--> elem(1)
            node.next = head;
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
    }

    /**
     * @apiNote удаление элемента сначала
     */
    public void removeFirst() {
        if (head != null && head.next != null) {
            head.next.prev = null;
            head = head.next;
        } else {
            head = null;
            tail = null;
        }
    }

    public void bubbleSort() {
        boolean needSort;
        do {
            needSort = false;
            Node node = head;
            while (node != null && node.next != null) {
                if (node.value > node.next.value) {
                    Node before = node.prev;
                    Node after = node.next.next;
                    Node current = node;
                    Node nextNode = node.next;

                    current.next = after;
                    current.prev = nextNode;
                    nextNode.next = current;
                    nextNode.prev = before;
                    if (before != null) {
                        before.next = nextNode;
                    } else {
                        head = nextNode;
                    }
                    if (after != null) {
                        after.prev = current;
                    } else {
                        tail = current;
                    }
                    needSort = true;
                }
                node = node.next;
            }
        } while (needSort);
    }
    private class Node {
        private Node next;
        private Node prev;
        private int value;
    }
}

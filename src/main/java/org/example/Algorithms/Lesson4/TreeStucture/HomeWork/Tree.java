package org.example.Algorithms.Lesson4.TreeStucture.HomeWork;

public class Tree {
    Node root;

    private class Node {
        public int value;
        public Node left;
        public Node right;
    }

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        return contains(value, root);
    }

    private boolean contains(int value, Node node) {
        if (node.value == value) {
            return true;
        } else {
            if (value < node.value) {
                return contains(value, node.left);
            }
            return contains(value, node.right);
        }
    }
}

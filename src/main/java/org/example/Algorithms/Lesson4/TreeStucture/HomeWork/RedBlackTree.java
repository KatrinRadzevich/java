package org.example.Algorithms.Lesson4.TreeStucture.HomeWork;

public class RedBlackTree {
    Node root;

    private class Node {
        public int value;
        private Color color;
        public Node left;
        public Node right;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", color=" + color +
                    '}';
        }
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

    private enum Color {
        BLACK, RED;
    }

    public boolean add(int value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalancing(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private boolean addNode(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > value) {
                if (node.left != null) {
                    boolean result = addNode(node.left, value);
                    node.left = rebalancing(node.left);
                    return result;
                } else {
                    node.left = new Node();
                    node.left.color = Color.RED;
                    node.left.value = value;
                    return true;
                }
            } else {
                if (node.right != null) {
                    boolean result = addNode(node.right, value);
                    node.right = rebalancing(node.right);
                    return result;
                } else {
                    node.right = new Node();
                    node.right.color = Color.RED;
                    node.right.value = value;
                    return true;
                }
            }
        }
    }

    private Node rebalancing(Node node) {
        Node result = node;
        boolean ifBalanced;
        do {
            ifBalanced = false;
            if (result.right != null && result.right.color == Color.RED &&
                    result.left == null || result.left.color == Color.BLACK) {
                ifBalanced = true;
                result = rightTurn(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.left.left != null && result.left.left.color == Color.RED) {
                ifBalanced = true;
                result = leftTurn(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.right != null && result.right.color == Color.RED) {
                ifBalanced = true;
                colorChange(result);
            }
        }
        while (ifBalanced);
        return result;
    }

    private Node leftTurn(Node node) {
        Node left = node.left;
        Node middle = left.right;
        left.right = node;
        node.left = middle;
        left.color = node.color;
        node.color = Color.RED;
        return left;
    }

    private Node rightTurn(Node node) {
        Node right = node.right;
        Node middle = right.left;
        right.left = node;
        node.right = middle;
        right.color = node.color;
        node.color = Color.RED;
        return right;
    }

    private void colorChange(Node node) {
        node.right.color = Color.BLACK;
        node.left.color = Color.BLACK;
        node.color = Color.RED;
    }
}

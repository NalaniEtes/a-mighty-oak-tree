package org.example;

public class Node {
    private Squirrel data;

    private Node leftChild;
    private Node rightChild;

    public Node(Squirrel data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void set_left(Node child) {
        this.leftChild = child;
    }

    public void set_right(Node child) {
        this.rightChild = child;
    }

    public Node left() {
        return this.leftChild;
    }

    public Node right() {
        return this.rightChild;
    }

    public Squirrel getData() {
        return this.data;
    }
}
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    @Test
    public void testNodeStoresSquirrel() {
        Squirrel s = new Squirrel("Cheeks");
        Node n = new Node(s);

        assertEquals("Cheeks", n.getData().getName());
    }

    @Test
    public void testSetLeftChild() {
        Squirrel parentSquirrel = new Squirrel("Parent");
        Node parent = new Node(parentSquirrel);

        Squirrel childSquirrel = new Squirrel("Lefty");
        Node leftChild = new Node(childSquirrel);

        parent.set_left(leftChild);

        assertEquals("Lefty", parent.left().getData().getName());
    }

    @Test
    public void testSetRightChild() {
        Squirrel parentSquirrel = new Squirrel("Parent");
        Node parent = new Node(parentSquirrel);

        Squirrel childSquirrel = new Squirrel("Righty");
        Node rightChild = new Node(childSquirrel);

        parent.set_right(rightChild);

        assertEquals("Righty", parent.right().getData().getName());


    }

    @Test
    public void testLeftChildIsNullByDefault() {
        Squirrel s = new Squirrel("Test");
        Node n = new Node(s);

        assertNull(n.left());
    }

    @Test
    public void testRightChildIsNullByDefault() {
        Squirrel s = new Squirrel("Test");
        Node n = new Node(s);

        assertNull(n.right());
    }

    @Test
    public void testAttackBothChildren() {
        Node root = new Node(new Squirrel("Root"));
        Node left = new Node(new Squirrel("Lefty"));
        Node right = new Node(new Squirrel("Righty"));

        root.set_left(left);
        root.set_right(right);

        assertEquals("Lefty", root.left().getData().getName());
        assertEquals("Righty", root.right().getData().getName());
    }
}
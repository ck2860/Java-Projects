package Homework15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNodeTest {
    /**
     * testing infixtraversal
     */

    @Test
    public void infixTraversal() {
        BinaryNode root = new BinaryNode(2);

        root.setLeft(new BinaryNode(3));
        root.getLeft().setLeft(new BinaryNode(9));
        root.getLeft().setRight(new BinaryNode(4));

        root.setRight(new BinaryNode(7));
        root.getRight().setLeft(new BinaryNode(1));
        root.getRight().setRight(new BinaryNode(6));

        StringifyVisitor visitor = new StringifyVisitor();
        root.infixTraversal(visitor);
//        System.out.println(visitor);

        String expected = "9 3 4 2 1 7 6 ";
        assertEquals(expected, visitor.toString());
    }
    /**
     * testing prefixtraversal
     */


    @Test
    public void prefixTraversal() {
        BinaryNode root = new BinaryNode(2);

        root.setLeft(new BinaryNode(3));
        root.getLeft().setLeft(new BinaryNode(9));
        root.getLeft().setRight(new BinaryNode(4));

        root.setRight(new BinaryNode(7));
        root.getRight().setLeft(new BinaryNode(1));
        root.getRight().setRight(new BinaryNode(6));

        StringifyVisitor visitor = new StringifyVisitor();
        root.prefixTraversal(visitor);
//        System.out.println(visitor);

        String expected = "2 3 9 4 7 1 6 ";
        assertEquals(expected, visitor.toString());
    }
    /**
     * testing postfixtraversal
     */


    @Test
    public void postfixTraversal() {
        BinaryNode root = new BinaryNode(2);

        root.setLeft(new BinaryNode(3));
        root.getLeft().setLeft(new BinaryNode(9));
        root.getLeft().setRight(new BinaryNode(4));

        root.setRight(new BinaryNode(7));
        root.getRight().setLeft(new BinaryNode(1));
        root.getRight().setRight(new BinaryNode(6));

        StringifyVisitor visitor = new StringifyVisitor();
        root.postfixTraversal(visitor);
//        System.out.println(visitor);

        String expected = "3 9 4 7 1 6 2 ";
        assertEquals(expected, visitor.toString());
    }
    /**
     * testing search
     */


    @Test
    public void search1() {
        BinaryNode root = new BinaryNode(2);

        root.setLeft(new BinaryNode(3));
        root.getLeft().setLeft(new BinaryNode(9));
        root.getLeft().setRight(new BinaryNode(4));

        root.setRight(new BinaryNode(7));
        root.getRight().setLeft(new BinaryNode(1));
        root.getRight().setRight(new BinaryNode(6));

        boolean search1 = root.search(5);

        assertEquals(false, search1);
    }
    /**
     * testing search
     */

    @Test
    public void search2() {
        BinaryNode root = new BinaryNode(2);

        root.setLeft(new BinaryNode(3));
        root.getLeft().setLeft(new BinaryNode(9));
        root.getLeft().setRight(new BinaryNode(4));

        root.setRight(new BinaryNode(7));
        root.getRight().setLeft(new BinaryNode(1));
        root.getRight().setRight(new BinaryNode(6));

        boolean search1 = root.search(6);

        assertEquals(true, search1);
    }
    /**
     * testing insert test
     */

    @Test
    public void insertTest() {
        BinaryNode bst = new BinaryNode(9);
        bst.binaryInsert(3);
        bst.binaryInsert(4);
        bst.binaryInsert(2);
        bst.binaryInsert(1);
        bst.binaryInsert(7);
        bst.binaryInsert(6);

        StringifyVisitor visitor = new StringifyVisitor();
        bst.prefixTraversal(visitor);

        String expected = "9 3 2 1 4 7 6 ";
        assertEquals(expected, visitor.toString());
    }
    /**
     * testing binary search
     */

    @Test
    public void binarySearchTestOne() {
        BinaryNode bst = new BinaryNode(9);
        bst.binaryInsert(3);
        bst.binaryInsert(4);
        bst.binaryInsert(2);
        bst.binaryInsert(1);
        bst.binaryInsert(7);
        bst.binaryInsert(6);

        boolean search1 = bst.binarySearch(6);
        assertEquals(true, search1);
    }
    /**
     * testing binary search
     */

    @Test
    public void binarySearchTestTwo() {
        BinaryNode bst = new BinaryNode(9);
        bst.binaryInsert(3);
        bst.binaryInsert(4);
        bst.binaryInsert(2);
        bst.binaryInsert(1);
        bst.binaryInsert(7);
        bst.binaryInsert(6);

        boolean search1 = bst.binarySearch(12);
        assertEquals(false, search1);
    }
    /**
     * testing compare
     */

    @Test
    public void compareTest() {
        BinaryNode bst = new BinaryNode(9);
        bst.binaryInsert(3);
        bst.binaryInsert(4);
        bst.binaryInsert(2);
        bst.binaryInsert(1);
        bst.binaryInsert(7);
        bst.binaryInsert(6);

        int search1 = bst.compare(6,7);
        assertEquals(-1, search1);
    }

}
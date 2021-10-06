package Homework15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringifyVisitorTest {
    /**
     * Testing visit method
     */

    @Test
    void visitTest() {

        BinaryNode bst = new BinaryNode(9);
        bst.binaryInsert(3);
        bst.binaryInsert(5);
        bst.binaryInsert(2);
        bst.binaryInsert(6);

        StringifyVisitor visitor = new StringifyVisitor();
        bst.prefixTraversal(visitor);

        String expected = "9 3 2 5 6 ";
        assertEquals(expected, visitor.toString());
    }

    /**
     * testing clear method
     */


    @Test
    void clearTest() {
        BinaryNode bst = new BinaryNode(9);
        bst.binaryInsert(3);
        bst.binaryInsert(5);
        bst.binaryInsert(2);
        bst.binaryInsert(6);

        StringifyVisitor visitor = new StringifyVisitor();
        bst.prefixTraversal(visitor);

        String expected = "9 3 2 5 6 ";
        assertEquals(expected, visitor.toString());

        visitor.clear();
        String expected1 = "";
        assertEquals(expected1, visitor.toString());

    }
}
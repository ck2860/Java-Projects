package Homework13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractStackTest {
    /**
     * for the implementation for the stack subclasses
     *
     */

    public abstract Stack<String> makeStack();

    /**
     * testing blank queue
     */
    @Test
    void make() {
        Stack<String> stack = makeStack();
        assertEquals(0, stack.size());
    }

    /**
     * testing push function with one string
     */

    @Test
    void pushTestOne() {
        Stack<String> stack = makeStack();

        stack.push("888");

        assertEquals(1, stack.size());
    }

    /**
     * testing push function with two strings.
     */

    @Test
    void pushTestTwo() {
        Stack<String> stack = makeStack();

        stack.push("888");
        stack.push("999");
        stack.push("777");

        assertEquals(3, stack.size());
    }

    /**
     * Testing peek function with one string
     */

    @Test
    void PeekTestOne() {
        Stack<String> stack = makeStack();
        stack.push("888");

        String actual1 = stack.peek();
        String actual2 = stack.peek();

        assertEquals(1, stack.size());
        assertEquals("888", actual1);
        assertEquals("888", actual2);
    }

    /**
     * Testing peek function with two strings.
     */
    @Test
    void PeekTestTwo() {
        Stack<String> stack = makeStack();
        stack.push("888");
        stack.push("999");
        stack.push("222");

        String actual1 = stack.peek();
        String actual2 = stack.peek();

        assertEquals(3, stack.size());
        assertEquals("222", actual1);
        assertEquals("222", actual2);
    }

    /**
     * testing pop function with one string
     */
    @Test
    void PopTestOne() {
        Stack<String> stack = makeStack();
        stack.push("888");

        String actual = stack.pop();

        assertEquals(0, stack.size());
        assertEquals("888", actual);
    }

    /**
     * testing pop function with two strings
     */
    @Test
    void PopTestTwo() {
        Stack<String> stack = makeStack();
        stack.push("888");
        stack.push("999");
        stack.push("222");

        String actual1 = stack.pop();
        String actual2 = stack.pop();

        assertEquals(1, stack.size());
        assertEquals("222", actual1);
        assertEquals("999", actual2);

    }
    /**
     * Testing all of the functions.
     */

    @Test
    void pushPeekPop() {
        Stack<String> stack = makeStack();
        stack.push("888");
        stack.push("999");
        stack.push("222");

        String actualPeek1 = stack.peek();
        String actualPop1 = stack.pop();
        String actualPeek2 = stack.peek();
        String actualPop2 = stack.pop();

        assertEquals(1, stack.size());
        assertEquals("222", actualPeek1);
        assertEquals("222", actualPop1);
        assertEquals("999", actualPeek2);
        assertEquals("999", actualPop2);
    }
    /**
     * Testing all of the functions.
     */


    @Test
    void pushPopPeek() {
        Stack<String> stack = makeStack();
        stack.push("888");
        stack.push("999");
        stack.push("222");

        String actualPop1 = stack.pop();
        String actualPeek1 = stack.peek();
        String actualPop2 = stack.pop();
        String actualPeek2 = stack.peek();


        assertEquals(1, stack.size());
        assertEquals("222", actualPop1);
        assertEquals("999", actualPeek1);
        assertEquals("999", actualPop2);
        assertEquals("888", actualPeek2);
    }
    /**
     * its for arrays, to test the array making sure it doesn't give you array's fixed size if you have less than 10.
     */
    @Test
    void sizeTestOne() {
        Stack<String> stack = makeStack();
        stack.push("888");
        stack.push("999");
        stack.push("222");
        stack.push("888");
        stack.push("999");
        stack.push("222");
        stack.push("888");

        assertEquals(7, stack.size());
    }

    /**
     * its for arrays, to make sure that we do not over allocate and make a copy of array into a bigger array
     */

    @Test
    void sizeTestTwo() {
        Stack<String> stack = makeStack();
        stack.push("888");
        stack.push("999");
        stack.push("222");
        stack.push("888");
        stack.push("999");
        stack.push("222");
        stack.push("888");
        stack.push("999");
        stack.push("222");
        stack.push("888");
        stack.push("999");
        stack.push("222");

        assertEquals(12, stack.size());
    }
}
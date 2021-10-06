package Homework13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractQueueTest {
    /**
     * for the implementation for the queue subclasses
     *
     */

    public abstract Queue<String> makeQueue();

    /**
     * testing blank queue
     */
    @Test
    void make() {
        Queue<String> queue = makeQueue();
        assertEquals(0, queue.size());
    }

    /**
     * testing one string in queue
     */

    @Test
    void enqueueTestOne() {
        Queue<String> queue = makeQueue();

        queue.enqueue("888");

        assertEquals(1, queue.size());
    }

    /**
     * testing several strings queued
     */

    @Test
    void enqueueTestTwo() {
        Queue<String> queue = makeQueue();

        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("777");


        assertEquals(3, queue.size());
    }

    /**
     * testing peaks with one string in the queue
     */

    @Test
    void PeekTestOne() {
        Queue<String> queue = makeQueue();
        queue.enqueue("888");

        String actual1 = queue.peek();
        String actual2 = queue.peek();

        assertEquals(1, queue.size());
        assertEquals("888", actual1);
        assertEquals("888", actual2);
    }

    /**
     * testing peaks with two strings in the queue
     */

    @Test
    void PeekTestTwo() {
        Queue<String> queue = makeQueue();
        queue.enqueue("888");
        queue.enqueue("999");


        String actual1 = queue.peek();
        String actual2 = queue.peek();

        assertEquals(2, queue.size());
        assertEquals("888", actual1);
        assertEquals("888", actual2);
    }

    /**
     * Testing Dequeue one string
     */

    @Test
    void DequeueTestOne() {
        Queue<String> queue = makeQueue();
        queue.enqueue("888");

        String actual = queue.dequeue();

        assertEquals(0, queue.size());
        assertEquals("888", actual);
    }

    /**
     * Testing Dequeue several strings
     */

    @Test
    void DequeueTestTwo() {
        Queue<String> queue = makeQueue();
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");

        String actual = queue.dequeue();

        assertEquals(2, queue.size());
        assertEquals("888", actual);
    }

    /**
     * Testing all three functions
     */

    @Test
    void enqueuePeekDequeueOne() {
        Queue<String> queue = makeQueue();
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");


        String actualPeek1 = queue.peek();
        String actualDequeue1 = queue.dequeue();
        String actualPeek2 = queue.peek();
        String actualDequeue2 = queue.dequeue();

        assertEquals(1, queue.size());
        assertEquals("888", actualPeek1);
        assertEquals("888", actualDequeue1);
        assertEquals("999", actualPeek2);
        assertEquals("999", actualDequeue2);
    }

    /**
     * Testing all of the functions.
     */

    @Test
    void enqueueDequeuePeek() {
        Queue<String> queue = makeQueue();
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");

        String actualDequeue1 = queue.dequeue();
        String actualPeek1 = queue.peek();
        String actualDequeue2 = queue.dequeue();
        String actualPeek2 = queue.peek();

        assertEquals(1, queue.size());
        assertEquals("888", actualDequeue1);
        assertEquals("999", actualPeek1);
        assertEquals("999", actualDequeue2);
        assertEquals("222", actualPeek2);
    }

    /**
     * its for arrays, to test the array making sure it doesn't give you array's fixed size if you have less than 10.
     */
    @Test
    void sizeTestOne() {
        Queue<String> queue = makeQueue();
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");
        queue.enqueue("888");

        assertEquals(7, queue.size());

    }

    /**
     * its for arrays, to make sure that we do not over allocate and make a copy of array into a bigger array
     */

    @Test
    void sizeTestTwo() {
        Queue<String> queue = makeQueue();
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");
        queue.enqueue("888");
        queue.enqueue("999");
        queue.enqueue("222");

        assertEquals(12, queue.size());

    }
}
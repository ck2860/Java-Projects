package Homework16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {
    /**
     * testing the strings, making sure they are in alphabet order.
     */
    @Test
    public void PriorityQueueTestOne() {
        StringLetter letter = new StringLetter();
        PriorityQueue test1 = new PriorityQueue(letter);
        test1.enqueue("BCD");
        test1.enqueue("ABC");
        test1.enqueue("CEFG");
        assertEquals("ABC", test1.peek());
    }
    /**
     * Testing enqueue and dequeue methods, making sure the values are still in right order.
     */
    @Test
    public void PriorityQueueTestTwo() {
        StringLetter letter = new StringLetter();
        PriorityQueue test1 = new PriorityQueue(letter);
        test1.enqueue("BCD");
        test1.enqueue("ABC");
        test1.enqueue("CEFG");
        assertEquals("ABC", test1.peek());
        test1.dequeue();
        assertEquals("BCD", test1.peek());
        test1.dequeue();
        assertEquals("CEFG", test1.peek());
    }

    /**
     * Testing with strings start with Z and a respectively.
     */
    @Test
    public void PriorityQueueTestThree() {
        StringLetter letter = new StringLetter();
        PriorityQueue test1 = new PriorityQueue(letter);
        test1.enqueue("Zoo");
        test1.enqueue("aardvark");
        assertEquals("aardvark", test1.peek());
        test1.dequeue();
        assertEquals("Zoo", test1.peek());
    }

    /**
     * testing with integers, making sure they are in their correct priority.
     */
    @Test
    public void PriorityQueueTestFour() {
        PriorityQueue test1 = new PriorityQueue();
        test1.enqueue(5);
        test1.enqueue(3);
        test1.enqueue(9);
        assertEquals(3, test1.peek());
    }

    /**
     * testing enqueue and dequeues methods
     */
    @Test
    public void PriorityQueueTestFive() {
        PriorityQueue test1 = new PriorityQueue();
        test1.enqueue(5);
        test1.enqueue(3);
        test1.enqueue(3);
        test1.enqueue(9);
        assertEquals(3, test1.peek());
        test1.dequeue();
        assertEquals(3, test1.peek());
        test1.dequeue();
        assertEquals(5, test1.peek());
        test1.dequeue();
        assertEquals(9, test1.peek());
    }

    /**
     * testing sizes
     */
    @Test
    public void PriorityQueueTestSix() {
        PriorityQueue test1 = new PriorityQueue();
        test1.enqueue(5);
        test1.enqueue(3);
        test1.enqueue(3);
        test1.enqueue(9);
        assertEquals(4, test1.size());
        test1.dequeue();
        assertEquals(3, test1.size());
    }

    /**
     * making sure the array successfully gets expanded.
     */
    @Test
    public void PriorityQueueTestSeven() {
        StringLetter letter = new StringLetter();
        PriorityQueue test1 = new PriorityQueue(letter);
        test1.enqueue("BCD");
        test1.enqueue("ABC");
        test1.enqueue("CEFG");
        test1.enqueue("Zoo");
        test1.enqueue("aardvark");
        test1.enqueue("Condy");
        test1.enqueue("Kan");
        test1.enqueue("Apple");
        test1.enqueue("banana");
        test1.enqueue("Rochester");
        test1.enqueue("RIT");
        test1.enqueue("Peanut");
        test1.enqueue("California");
        test1.enqueue("Sea");
        test1.enqueue("flag");
        assertEquals("aardvark", test1.peek());
        test1.dequeue();
        assertEquals("ABC", test1.peek());
        test1.dequeue();
        assertEquals("Apple", test1.peek());
        test1.dequeue();
        assertEquals("banana", test1.peek());
        test1.dequeue();
        assertEquals("BCD", test1.peek());
        test1.dequeue();
        assertEquals("California", test1.peek());
        test1.dequeue();
        assertEquals("CEFG", test1.peek());
        test1.dequeue();
        assertEquals("Condy", test1.peek());
        test1.dequeue();
        assertEquals("flag", test1.peek());
        test1.dequeue();
        assertEquals("Kan", test1.peek());
        test1.dequeue();
        assertEquals("Peanut", test1.peek());
        test1.dequeue();
        assertEquals("RIT", test1.peek());
        test1.dequeue();
        assertEquals("Rochester", test1.peek());
        test1.dequeue();
        assertEquals("Sea", test1.peek());
        test1.dequeue();
        assertEquals("Zoo", test1.peek());
    }

    /**
     * testing integers as strings.
     */
    @Test
    public void PriorityQueueTestEight() {
        StringLetter letter = new StringLetter();
        PriorityQueue test1 = new PriorityQueue(letter);
        test1.enqueue("34532");
        test1.enqueue("12345");
        test1.enqueue("23445");
        assertEquals("12345", test1.peek());
        assertEquals("12345", test1.peek());

    }

    /**
     * testing mixed strings and integers as strings.
     */
    @Test
    public void PriorityQueueTestNine() {
        StringLetter letter = new StringLetter();
        PriorityQueue test1 = new PriorityQueue(letter);
        test1.enqueue("kan");
        test1.enqueue("12345");
        test1.enqueue("condy");
        assertEquals("12345", test1.peek());
        assertEquals("12345", test1.peek());
    }
}
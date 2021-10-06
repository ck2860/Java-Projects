package Homework16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHeapTest {
    /**
     * testing add and remove methods
     */
    @Test
    public void addnRemoveTest(){
        StringLetter letter = new StringLetter();
        MyHeap<String> heap = new MyHeap<>(letter);
        heap.add("Banana");
        heap.add("Watermelon");
        heap.add("Apple");

        String expected = "Apple";
        String expectedTwo = "Banana";
        String expectedThree = "Watermelon";
        assertEquals(expected, heap.remove());
        assertEquals(expectedTwo, heap.remove());
        assertEquals(expectedThree, heap.remove());
    }
    /**
     * testing add and remove methods
     */
    @Test
    public void addnRemoveTestTwo(){
        StringLetter letter = new StringLetter();
        MyHeap<String> heap = new MyHeap<>(letter);
        heap.add("Banana", "Watermelon", "Apple");

        String expected = "Apple";
        String expectedTwo = "Banana";
        String expectedThree = "Watermelon";
        assertEquals(expected, heap.remove());
        assertEquals(expectedTwo, heap.remove());
        assertEquals(expectedThree, heap.remove());
    }

    /**
     * testing the size method.
     */
    @Test
    public void SizeTest(){
        StringLetter letter = new StringLetter();
        MyHeap<String> heap = new MyHeap<>(letter);
        heap.add("Banana", "Watermelon", "Apple");
        heap.remove();
        assertEquals(2,heap.size());
    }
}
package Homework16;

import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueue <T> implements Queue<T> {
    /**
     * implementing queue interface.
     * using myheap class for priority queue so added private field of my heap.
     */
    private MyHeap<T> heap;

    /**
     * the parameterless constructor that creates a heap with a null comparator
     */
    // parameterless constructor that creates a heap with a null comparator.
    public PriorityQueue(){
        this.heap = new MyHeap<>(null);
    }

    /**
     * the constructor declare a comparator parameter and uses it to create the heap.
     * @param comparator
     */

    //constructor with a comparator parameter.
    public PriorityQueue(Comparator<T> comparator){
        this.heap = new MyHeap<>(comparator);
    }

    /**
     * adding the values and using the heap to create the priority.
     * @param value The value would be added and placed by its own correct priority position.
     */

    @Override
    public void enqueue(T value){
        heap.add(value);
    }

    /**
     * Returns but does not remove the value at the front of the queue.
     * @return The value at the front of the queue.
     */
    @Override
    public T peek() {
        T peeking = heap.remove(); // remove
        heap.add(peeking); // add the removed value
        return peeking;
    }

    /**
     * Removes and returns the value at the front of the queue.
     * @return The value at the front of the queue.
     */

    @Override
    public T dequeue() {
        return heap.remove();
    }

    /**
     * the size of queue
     * @return the size of queue
     */
    @Override
    public int size() {
        return heap.size();
    }

    public static void main(String[] args) {
        StringLetter letter = new StringLetter(); // string comparator
        PriorityQueue test1 = new PriorityQueue(letter);
        test1.enqueue("BCD");
        test1.enqueue("ABC");
        test1.enqueue("EFG");
        System.out.println(test1.peek());
        test1.dequeue();
        System.out.println(test1.peek());
        test1.dequeue();
        System.out.println(test1.peek());


    }

}

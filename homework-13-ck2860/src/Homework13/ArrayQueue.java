package Homework13;

import java.util.Arrays;

/**
 * A Array-based implementation of a queue.
 *
 * @param <T> The type of values stored in the queue.
 */
public class ArrayQueue<T> implements Queue<T> {
    /**
     * The array of the queue. This contains the newest value in
     * the queue
     */
    private Object[] array;
    private int front;
    private int back;
    /**
     * The constructor that sets number of array in the queue.
     */
    public ArrayQueue() {
        this.array = new Object[10];
        this.front = -1;
        this.back = -1;
    }
    /**
     * The value is to add values in the queue
     * @param value The value added to the back of the queue.
     */

    @Override
    public void enqueue(T value) {
        if (back  >= array.length - 1) {
            this.array = Arrays.copyOf(array, (2 * array.length));
        }
        back++;
        array[back] = value;
    }

    /**
     * The method is to get the value of the front of the queue
     * @return the value of the front of the queue
     */

    @Override
    public T peek() {
        return (T)array[front+1];
    }

    /**
     * The method is to dequeue the front value and return the front value.
     * @return the last value (non-null) in the array
     */

    @Override
    public T dequeue() {
        if (front < back){
            front++;
            T value = (T) array[front];
            return value;
        }
        return null;
    }


    /**
     * The method is to return the length of array
     * @return array length
     */

    @Override
    public int size() {
        return back-front;
    }

    public static void main(String[] args) {
        Queue test = new ArrayQueue();
    }
}

package Homework16;

public interface Queue <T> {
    /**
     * Adds a new value to the priority queue
     * @param value The value would be added and placed by its own correct priority position.
     */
    public void enqueue(T value);
    /**
     * Returns but does not remove the value at the front of the queue.
     * @return The value at the front of the queue.
     */
    public T peek();
    /**
     * Removes and returns the value at the front of the queue.
     * @return The value at the front of the queue.
     */
    public T dequeue();
    /**
     * Returns the number of values in the queue.
     * @return The number of values in the queue.
     */
    public int size();
}

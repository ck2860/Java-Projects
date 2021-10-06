package Homework16;

public interface Heap <T> {
    /**
     * adds a new value to the heap
     * @param value value
     */
    public void add(T value);

    /**
     * adds more than one value to the heap
     * @param values several values
     */
    public void add(T... values);

    /**
     * removes and returns the highest priority value in the heap
     * @return removed value
     */
    public T remove();

    /**
     * returns the number of value in the heap
     * @return the size in the heap
     */
    public int size();
}

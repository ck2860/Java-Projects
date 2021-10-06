package Homework16;

import java.util.Arrays;
import java.util.Comparator;

public class MyHeap<T> implements  Heap<T> {
    /**
     * implementing the heap interface.
     * creating three fields: array, size, and comparator.
     */
    private Object[] array;
    private int size;
    private Comparator<T> comparator;

    /**
     * The constructor is created
     * the array is initialized to 8.
     * the size is initialized to 0
     * @param comparator a comparator
     */

    public MyHeap(Comparator<T> comparator) {
        array = new Object[8];
        size = 0;
        this.comparator = comparator;
    }
    /**
     * The parameterless constructor is created
     * the array is initialized to 8.
     * the size is initialized to 0
     * comparator sets to  null.
     */

    public MyHeap() {
        array = new Object[8];
        size = 0;
        comparator = null;
    }

    /**
     * The method would compare two instances by using a comparator
     * @param a first T
     * @param b second T
     * @return
     */

    private int compare(T a, T b) {
//        if (comparator != null && a != null && b != null) {
        if (comparator != null) {
            //use comparaator here
            return comparator.compare(a, b);
        } else {
            // use comparable here
            Comparable<T> ca = (Comparable<T>) a;
            return ca.compareTo(b);
        }
    }

    /**
     * Once the first node is added to the heap, it becomes root.
     * Every time node is created, its added to the leftmost open position in the bottom level of the tree.
     * If a newly added node has a higher priority than its parent then the values would be swapped.
     * It would swap until the value is in the correct priority position.
     * @param array
     * @param index
     */

    public void siftUp(Object[] array, int index) {
        int parent = (index - 1) / 2;
//        while(array[parent] > array[index]) {
        while (compare((T) array[parent], (T) array[index]) > 0) {
            swap(array, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * Since the root always contains the hgihest prority value, so the
     * root is always the value removed from the heap.
     * Then copy the value from the rightmost node in the bottom level to the toot
     * then remove that right most node from the bottom level.
     * This would be siftdwon to the right position.
     * @param array
     * @param size
     */

    public void siftDown(Object[] array, int size) {
        int to = 0;
        int from;
        do {
            from = to;

            int left = 2 * from + 1;
            int right = left + 1;
//            if(left < size && array[left] < array[to]) {
            if (left < size && compare((T) array[left], (T) array[to]) < 0) {
                to = left;
            }

//            if(right < size && array[right] < array[to]) {
            if (right < size && compare((T) array[right], (T) array[to]) < 0) {
                to = right;
            }

            swap(array, from, to);

        } while (from != to);
    }

    /**
     * Swapping one value to other value
     * @param array an array
     * @param from the "least" priority value
     * @param to the highest priority value
     */

    public void swap(Object[] array, int from, int to) {
        if (from != to) { // if its'not equal
            Object tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
        }
    }
    /**
     * adds a new value to the heap
     * When the array gets filled, the copyof method would be used in order to make it twice bigger
     * siftup method would be called in the end.
     * @param value value
     */
    @Override
    public void add(T value) {
        if (array.length == size) {
            array = Arrays.copyOf(array, size * 2);
        }
        array[size] = value;
        size++;
        siftUp(array, size - 1);
    }

    /**
     * adds more than one value to the heap
     * @param values several values
     */

    @Override
    public void add(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    /**
     * removes and returns the highest priority value in the heap
     * After copying the value, the value would be erased by overwriting with a null.
     * @return removed value
     */
    @Override
    public T remove() {
        T root = (T) array[0]; // should get last element
//        array[0] = array[size - 1];
        size--;
        swap(array, 0, size);
        array[size] = null; // removing the value from the heap.

        siftDown(array, size); //
        return root;
    }

    /**
     * returns the number of value in the heap
     * @return the size in the heap
     */

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyHeap testing = new MyHeap();

    }

}

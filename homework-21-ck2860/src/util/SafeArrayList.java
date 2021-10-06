package util;

import java.util.Arrays;

public class SafeArrayList<T> implements MyList<T> {
    /**
     * The current size (number of elements) of the list.
     */
    private int size;

    /**
     * The array used to store elements in the list.
     */
    private Object[] elements;

    /**
     * Creates a new, empty list.
     */
    public SafeArrayList() {
        size = 0;
        elements = new Object[8];
    }

    @Override
    public synchronized void add(T element) {
//        synchronized (this) {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, size * 2);
            }

            elements[size] = element;
            size++;
//        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        return (T)elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
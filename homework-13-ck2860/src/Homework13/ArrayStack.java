package Homework13;

import java.util.Arrays;
/**
 * A array-based implementation of the Stack ADT.
 *
 * @param <T> The type of values stored in the stack.
 */
public class ArrayStack<T> implements Stack<T> {
    /**
     * The array of the stack.
     */
    private Object[] array;
    /**
     * The object at the top of the stack. This contains the newest value in
     * the stack.
     */
    private int top;

    /**
     * The constructor that sets number of array in the stack.
     */
    public ArrayStack() {
        this.array = new Object[10];
        top = -1;
    }


    /**
     * The push method is to use to add values to the array.
     * Doubling the size if we are trying to over-allocate the data into the array.
     *
     * @param value The value added to the top of the stack.
     */

    @Override
    public void push(T value) {
        // check if array[length - 1] not null, then double size of array
        if (top >= array.length-1) {
            this.array = Arrays.copyOf(array, (2 * array.length));
        }
        top++;
        array[top] = value;
        }

    /**
     * The method is to return the last value in the array.
     *
     * @return the last value in the array.
     */

    @Override
    public T peek() {
        return (T)array[top];
    }

    /**
     * The method is to pop the value and return the value.
     *
     * @return the last value (non-null) in the array
     */

    @Override
    public T pop() {
        if (top > -1) {
            T value = (T) array[top];
            top--;
            return value;
        }
        return null;
    }

        /**
         * the size of the array length
         * @return array length
         */

        @Override
        public int size () {
            return top+1;
        }
    }

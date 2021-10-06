package session16;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private Object[] array;

    public ArrayStack() {
        this.array = new Object[10];
    }


    @Override
    public void push(T value) {
        // check if array[length - 1] not null, then double size of array
        if (array[array.length-1] != null){
            Arrays.copyOf(array, (2*array.length));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = (T)value;
                break;
            }
        }

    }



    @Override
    public T peek() {
        if (array[0] == null) {
            return null;
        }
        for (int i = 1; i < array.length + 1; i++) {
            if (i == array.length || array[i] == null) {
                return (T)array[i - 1];
            }
        }
        return null;
    }

    @Override
    public T pop() {
        if (array[0] == null) {
            return null;
        }
        for (int i = 1; i < array.length + 1; i++) {
            if (i == array.length || array[i] == null) {
                //return array[i - 1];
                T value = (T)array[i - 1];
                array[i-1] = null; // remove
                return value;
            }
        }
        return null;
    }



    @Override
    public int size() {
        return array.length;
    }
}

package Homework13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayDeque<T> implements Deque<T> {
    private List<T> array;
//    private int first;
//    private int last;
    private int size;

    public ArrayDeque(){
        array= new ArrayList<>();
//        first = 0;
//        last = 0;
        size = 0;
    }

    @Override
    public void add(T value){
        addLast(value);
    }

    @Override
    public void addFirst(T value) {
        array.add(0,value);
        size++;
    }

    @Override
    public void addLast(T value) {
        array.add(size, value);
        size++;
    }

    @Override
    public T peekFirst() {
       return array.get(0);
    }

    @Override
    public T peekLast() {
        return array.get(size);
    }

    @Override
    public T removeFirst() {
        if(array.isEmpty()){
            return null;
        }
        return array.remove(0);
    }


    @Override
    public T removeLast() {
        if(array.isEmpty()){
            return null;
        }
        return array.remove(size);
    }


    @Override
    public boolean contains(Object o) {
        if (array.contains(o)) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayDeque test = new ArrayDeque();

    }
}

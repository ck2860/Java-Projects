package Homework13;

public interface Deque<T>{
    // adds an element to the tail
    void add(T value);
    // adds an an element to the head
    void addLast(T value);
    // adds an element to the tail
    void addFirst(T value);
    // retrieves but doesn't remove the first element
    T peekFirst();
    // retrieves but doesn't remove the last element
    T peekLast();
    // removes the first element;
    T removeFirst();
    // removes the last element;
    T removeLast ();
    //Returns true if the specified element is present in the Deque
    boolean contains (Object o);
    // size
    int size();

}

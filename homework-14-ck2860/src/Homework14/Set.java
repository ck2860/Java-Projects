package Homework14;

public interface Set <E> {
    /**
     * adds an element to the set
     * @param element
     */
    void add(E element);

    /**
     * removes an element from the set
     * @param element
     */
    void remove (E element);

    /**
     * returns true if the element is in the set. Otherwise, false.
     * @param element
     * @return true or false if there's an element in the set
     */
    boolean contains(E element);

    int size();
}

/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework09;
/*
 *Answering the question #1 of Homework #09
 */
public interface Items {
    /**
     * this is for the function that would add a single object to the collection
     * @param item an object
     */
    public void add(Object item);
    /**
     * it is for the function that would return an item at specific index from the collection
     * @param index an index
     * @return an item at specific index
     */
    public Object get(int index);
    /**
     * this function (that would be defined in the abstract class) gives the final count.
     * @return numbers of items in the collection.
     */
    public int size();
    /**
     * adds all of the elements into the array.
     * @param items
     */
    public void addAll(Object[] items);
}
// end of Items interface
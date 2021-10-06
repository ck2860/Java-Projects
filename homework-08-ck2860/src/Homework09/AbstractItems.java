/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework09;
/*
 *Answering the question #2 of Homework #09
 */
public abstract class AbstractItems implements Items { // if you use abstract you do not need to add all of the methods here.
    /**
     * there is an field for an array that holds objects.
     */
//    Object [] array;
    /**
     * The function has implemented from Items interface. It adds objects in the array by using
     * the for loop.
     * @param items any kind of items.
     */
    @Override
    public void addAll (Object [] items){
        for (Object obj : items){ //add each object from the items array.
            add(obj);
        }
    }
    /**
     * toString method was used to print every items on a single line.
     * @return strings of list
     */
    @Override
    public String toString(){
        String line = "";
//        for (Object obj : array)
        int i = 0;
        while (i < size()){
//            if (array[i] != null)
            line += get(i) + " ";
            i++;
        }
        return line;
    }
}
// end of AbstractItems.java

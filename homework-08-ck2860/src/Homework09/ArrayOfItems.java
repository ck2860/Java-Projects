/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework09;
/*
 *Answering the question #3 of Homework #09
 */
public class ArrayOfItems extends AbstractItems {
    /**
     * the class is the extended from AbstractItem, which is a parent class.
     * the private field for the integer size.
     */
    private int size;
    private Object [] array;
    /**
     * The constructor for ArrayOfItems that takes integer size parameter
     * @param size amount of items to hold for an array.
     */
    public ArrayOfItems(int size) {
        super();
        this.array = new Object[size];
    }
    /**
     * add function is to add a single object to the collection.
     * So every time it calls, it adds to the next place, etc..
     * @param item an object
     */
    @Override
    public void add(Object item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;
                break;
            }
        }
    }
//        size = 0;
//        while (size > array.length){
//            array[size] = item;
//            size++;
//        }
//    }
    /**
     * this function is defined to return an item at a specific index.
     * @param index an index
     * @return an item from the array's index.
     */
    @Override
    public Object get(int index) {
        return array[index];
    }
    /**
     * this function has implemented to return the number of items in the array
     * @return the number of items in the collection.
     */
    @Override
    public int size() {
        int arrayLength = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != null){
                arrayLength += 1;
            }
        }
        return arrayLength;
    }
    /**
     * The main method is used to test the addAll and toStringmethods to s
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        Object [] testArray = new Object[5];
        testArray[0] = "Food";
        testArray[1] = 0;
        testArray[2] = "HOLA";
        testArray[3] = "@";
        testArray[4] = 3;
        ArrayOfItems items = new ArrayOfItems(20);
        items.add("10");
        items.addAll(testArray);
        System.out.println(items.get(3));
        System.out.println(items.get(10));
        System.out.println(items.size());
        System.out.println(items);
    }
}
// end of ArrayOfItems.Java

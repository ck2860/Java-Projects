/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework09;
/*
 *Answering the question #6 of Homework #09
 */
public class ItemsTest {
    /**
     * the testing method is used to test all of the methods that we created in Items interface.
     * @param items item instance
     */
    public static void testItems(Items items){
        items.add("5");
        Object [] testArray = new Object[10];
        testArray[0] = "a";
        testArray[1] = "b";
        testArray[2] = "c";
        testArray[3] = "d";
        testArray[4] = "e";
        testArray[5] = "f";
        testArray[6] = "g";
        testArray[7] = "h";
        testArray[8] = "i";
        testArray[9] = "j";
        items.addAll(testArray);
        System.out.println(items.get(2) + " is an item at index " + 2 + " of the collection.");
        System.out.println(items.get(5) + " is an item at index " + 5 + " of the collection.");
        System.out.println(items.size() + " is the number of items stored in the collection.");
        System.out.println("The objects that are stored in this array: ");
        System.out.println(items);
    }
    /**
     * Two instances of ArrayOfItems are created to show that one is able to store all of the items that we created in the testItem method
     * and the second one shows that it has the ability to ignores values after the array is full and only can hold those amounts as it takes parameter.
     *
     * two instances of ListofItems are created to ...
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args){
        System.out.println("This ArrayofItems #1 holds all of the items: ");
        Items full = new ArrayOfItems(11);
        testItems(full);
        System.out.println("____________________________");
        System.out.println("Showing the ArrayOfItems #2 (holds 8 items only) ignores values after the array is full.");
        Items test1 = new ArrayOfItems(8);
        testItems(test1);
        System.out.println("____________________________");
        System.out.println("Showing the ArrayOfItems #2 (holds 6 items only) ignores values after the array is full.");
        Items test1a = new ArrayOfItems(6);
        testItems(test1a);
        System.out.println("____________________________");
        System.out.println("This ListOfItems #1 holds all of the items: ");
        Items test2 = new ListOfItems();
        testItems(test2);
        System.out.println("____________________________");
        System.out.println("This ListOfItems #2 holds all of the items: ");
        Items test2a = new ListOfItems();
        testItems(test2a);
    }
}
// end of ItemsTest.Java

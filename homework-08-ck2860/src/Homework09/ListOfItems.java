/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework09;
/*
 *Answering the question #5 of Homework #09
 */
public class ListOfItems extends AbstractItems {
    /**
     * The class is extended from AbstractItems.
     * Three private fields are created (int size, two type of Nodes: head and tail).
     */
//    private int throwaway;
    private int size;
    private Node head;
    private Node tail;
    /**
     * The parameterless constructor that sets size to 0 so every time, a list of items is created doesn't have an item yet.
     * The node is created and set both the head and the tail.
     */
    public ListOfItems() {
//        throwaway = 0;
        size = 0;
        Node node = new Node();
        head = node;
        head.node = tail;
        tail = node;
    }
    /**
     * the Add function is implemented from the Item interface, the Object will be added to the head node first time.
     * As size increments and each time add method is called, the node is newly created and the object will be added to the new node: tail.
     * @param item an object
     */
    @Override
    public void add(Object item) {
//        Node newNode = new Node();
        if (this.size == 0) {
            head.setItem(item);
        } else {
            Node newNode = new Node();
            newNode.setItem(item);
            setNext(newNode);
            tail = newNode;
            //size ++;
        }
//        System.out.println("test");
        size++;
    }

    /**
     * The get method is implemented from the Item interface, start at the head  then use getNext() method to get final number of nodes.
     * @param index an index
     * @return an item in the collection, at the specific index
     */
    @Override
    public Object get(int index) {
        int i = 0;
        if (size > index){
            Node temp  = head;
            while (i < index && i < getNext()) {
                temp = temp.getNode();
//                head = head.getNode();
                i++;
            }
            return temp.getItem();
        }else{
            return null;
        }
    }

    /**
     * the getNext method is used to count the appropriate number of nodes
     * @return number of nodes.
     */

    public int getNext() {
//        head = head.getNode();
////        return head;
//        int count = 0;
//        while (head != null) {
//            head = head.getNode();
//            count++;
//        }
//        return count;
        return size;
    }

    /**
     * The setNext method is for setting next, to set the node.
     * @param n node
     */

    public void setNext(Node n) {
        tail.setNode(n);
        tail = n;
    }

    /**
     * The size method is used to return getNext();
     * @return
     */

    @Override
    public int size() {
//        int count = 0;
//        while(head!= null){
//            head = head.getNode();
//            count++;
//        }
//        return count;
//        return getNext();
        return size;
//        return size; // this is whats causing the problem. If we replace this with throwaway, then the add function works fine
    }

    /**
     * The main method is used to test the addAll and toStringmethods to s
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
//        Object [] testArray = new Object[5];
//        testArray[0] = "Food";
//        testArray[1] = 0;
//        testArray[2] = "HOLA";
//        testArray[3] = "@";
//        testArray[4] = 3;
//        ListOfItems items = new ListOfItems();
//        items.add("10");
//        items.addAll(testArray);
//        System.out.println(items.get(3));
////        System.out.println(items.get(10));
//        System.out.println(items.size());
//        System.out.println(items);

        Object [] testArray = new Object[2];
        ListOfItems lof1 = new ListOfItems();
        lof1.add(1);
        lof1.add(2);
        lof1.add("hi");
        testArray[0]="happy";
        testArray[1]="birthday";
        lof1.addAll(testArray);
        Object size = lof1.getNext();
        System.out.println(size);
        System.out.println(lof1.get(3));
        System.out.println(lof1.get(10));
        System.out.println(lof1);
    }
}
// end of ListOfItems.Java
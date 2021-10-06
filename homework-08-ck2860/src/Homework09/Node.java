/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework09;
/*
 *Answering the question #4 of Homework #09
 */
public class Node {
    /**
     * there are two fields for the Node class: Object item and Node node.
     */
    private Object item;
    public Node node;
    /**
     * The parameterless constructor that has two instance variables: Object and Node.
     */
    public Node(){
        Object item;
        Node node;
    }
    /**
     * An accessor for an item
     * @return item
     */
    public Object getItem() {
        return this.item;
    }
    /**
     * An mutator to set an item
     * @param item an object
     */
    public void setItem(Object item) {
        this.item = item;
    }
    /**
     * An accessor for node
     * @return an node
     */
    public Node getNode() {
        return this.node;
    }
    /**
     * An mutator for node
     * @param node an node.
     */
    public void setNode(Node node) {
        this.node = node;
    }
}
// End of Node Java Class

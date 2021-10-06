package Homework13;
/**
 * A node-based implementation of the Stack ADT.
 *
 * @param <T> The type of values stored in the stack.
 */
public class NodeStack<T> implements Stack<T> {
    /**
     * The node at the top of the stack. This contains the newest value in
     * the stack.
     */
    private Node<T> top;

    /**
     * The number of nodes in the stack.
     */
    private int size;

    /**
     * the constructor for NodeStack
     */
    public NodeStack() {
        top = null;
        size = 0;
    }

    /**
     * The method is to push the node by creating a new node.
     * @param value The value added to the top of the stack.
     */
    @Override
    public void push(T value) {
        // create a new node with the current top as the next node
        Node<T> node = new Node<>(value, top);
        // make the new node the top
        top = node;
        // increment the size
        size++;
    }

    /**
     * The method is to return the top node.
     * @return the value of the top node
     */
    @Override
    public T peek() {
        // return the value in the top node
        return top.getValue();
    }

    /**
     * the method is to get the value of the top node then removing the node.
     * @return the value in the top node
     */

    @Override
    public T pop() {
        // get the value in the top node
        T value = top.getValue();
        // set the top to the next node in the stack
        top = top.getNext();
        // decrement the size
        size--;
        // return the value
        return value;
    }

    /**
     * the method to return the size of nodes
     * @return size of nodes
     */

    @Override
    public int size() {
        return size;
    }
}
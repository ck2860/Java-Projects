package Homework15;

public class StringifyVisitor implements Visitor {
    /**
     * since it implemented Visitor interface, we would like to use stringBuilder for the visit function.
     * So we use StringBuilder function to append node's value to a string
     */
    private StringBuilder stringBuilder;

    /**
     * The constructor that start with stringBuilder.
     */
    public StringifyVisitor(){
        stringBuilder = new StringBuilder();
    }

    /**
     * the function is to visit a node in the tree.
     * The stringBuilder is used to get add the nodes into string
     * @param node binaryNode node
     */
    @Override
    public void visit(BinaryNode node) {
        if (node != null){
            stringBuilder.append(node.getValue());
            stringBuilder.append(" ");
        }
    }

    /**
     * This function is used to return string of Binary nodes.
     * @return string.
     */

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    /**
     * this function is used to clear its "visits"
     */

    public void clear(){
        stringBuilder = new StringBuilder();
    }
}

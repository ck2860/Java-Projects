package Homework13;

import static org.junit.jupiter.api.Assertions.*;

class NodeStackTest extends AbstractStackTest{
    /**
     * extends the AbstractStackTest, implemented
     * @return strings in Nodes
     */
    @Override
    public Stack<String> makeStack() {
        NodeStack<String> stringNodeStack = new NodeStack<>();
        return stringNodeStack;
    }
}
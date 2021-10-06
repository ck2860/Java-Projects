package Homework13;

import static org.junit.jupiter.api.Assertions.*;

class NodeQueueTest extends AbstractQueueTest{
    /**
     * extends the AbstractQueueTest, implemented
     * @return strings in Nodes
     */
    @Override
    public Queue<String> makeQueue() {
        NodeQueue<String> stringNodeQueue = new NodeQueue<>();
        return stringNodeQueue;
    }
}

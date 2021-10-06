package Homework13;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayQueueTest extends AbstractQueueTest{
    /**
     * extends the AbstractQueueTest, implemented
     * @return strings in array
     */
    @Override
    public Queue<String> makeQueue() {
        ArrayQueue<String> stringArrayQueue = new ArrayQueue<>();
        return stringArrayQueue;
    }

}

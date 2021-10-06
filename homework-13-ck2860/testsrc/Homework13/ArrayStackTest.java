package Homework13;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest extends AbstractStackTest{
    /**
     * extends the AbstractStackTest, implemented
     * @return strings in array
     */
    @Override
    public Stack<String> makeStack() {
        Stack<String> stringArrayStack = new ArrayStack<>();
        return stringArrayStack;
    }
}
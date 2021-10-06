package Homework14;

import static org.junit.jupiter.api.Assertions.*;

class ChainingHashmapTest extends AbstractMapTest{

    @Override
    public Map<Integer, String> makeMap() {
        ChainingHashmap<Integer, String> chainMapping = new ChainingHashmap<>();
        return chainMapping;
    }
}
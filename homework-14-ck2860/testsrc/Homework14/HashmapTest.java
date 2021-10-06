package Homework14;

import static org.junit.jupiter.api.Assertions.*;

class HashmapTest extends AbstractMapTest{

    @Override
    public Map<Integer, String> makeMap() {
        Hashmap<Integer, String> hashMapping = new Hashmap<>();
        return hashMapping;
    }
}
package session17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashmapTest {

    @Test
    void simpleTest(){
        Map<Integer, String> map = new Hashmap<>();
        map.put(1, "123");
        map.put(10, "1024");
        map.put(50, "Something");
        map.put(51, "apple");
        map.put(55, "apple2");
        map.put(50000,"50000");

        assertEquals("123", map.get(1));
        assertEquals("1024", map.get(10));
        assertEquals("Something", map.get(50));
        assertEquals("apple", map.get(51));
        assertEquals("apple2", map.get(55));
        assertEquals("50000", map.get(50000));

    }

}
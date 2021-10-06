package Homework14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractMapTest {
    /**
     * For the implementation for test
     */
    public abstract Map<Integer, String> makeMap();

    /**
     * Testing put and get methods.
     */
    @Test
    void mapTestZero(){
        Map<Integer, String> map = makeMap();
        map.put(1, "123");
        String expected = map.get(1);

        assertEquals("123", expected);

    }
    /**
     * testing map within placing values in less than 100th place
     */
    @Test
    void mapTestOne(){
        Map<Integer, String> map = makeMap();
        map.put(1, "123");
        map.put(10, "1024");
        map.put(50, "Something");
        map.put(51, "apple");
        map.put(55, "apple2");

        assertEquals("123", map.get(1));
        assertEquals("1024", map.get(10));
        assertEquals("Something", map.get(50));
        assertEquals("apple", map.get(51));
        assertEquals("apple2", map.get(55));
    }

    /**
     * testing maps within values over 100th place.
     */
    @Test
    void mapTestTwo(){
        Map<Integer, String> map = makeMap();
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

    /**
     * testing replacement
     */
    @Test
    void mapTestThree(){
        Map<Integer, String> map = makeMap();
        map.put(1, "123");
        map.put(10, "1024");
        map.put(50, "Something");
        map.put(50, "apple");
        map.put(150, "double dude");
        map.put(55, "apple2");
        map.put(50000,"50000");

        assertEquals("123", map.get(1));
        assertEquals("1024", map.get(10));
        assertNotEquals("Something", map.get(50));
        assertEquals("double dude", map.get(150));
        assertEquals("apple", map.get(50));
        assertEquals("apple2", map.get(55));
        assertEquals("50000", map.get(50000));
    }
    /**
     * testing null
     */
    @Test
    void mapTestFour(){
        Map<Integer, String> map = makeMap();
        map.put(1, "123");
        map.put(50000,"50000");

        assertEquals("123", map.get(1));
        assertEquals(null, map.get(10));
        assertEquals(null, map.get(50));
        assertEquals(null, map.get(150));
        assertEquals(null, map.get(50));
        assertEquals(null, map.get(55));
        assertEquals("50000", map.get(50000));
    }
    /**
     * testing size.
     */
    @Test
    void mapTestFive(){
        Map<Integer, String> map = makeMap();
        for (int i = 0; i < 100; i ++){
            map.put(i, "Hii");
        }
        assertEquals(100, map.size());
    }
    /**
     * Making sure rehashing works.
     */
    @Test
    void mapTestSix(){
        Map<Integer, String> map = makeMap();
        for (int i = 0; i < 105; i ++){
            map.put(i, "Hii");
        }
        assertEquals(105, map.size());
    }
    /**
     * Testing Rehashing and checking if it stored the key/value pairs properly
     */
    @Test
    void mapTestSeven(){
        Map<Integer, String> map = makeMap();
        for (int i = 0; i < 105; i ++){
            map.put(i, "Hii");
        }
        assertEquals(105, map.size());
        assertEquals("Hii", map.get(10));
        assertEquals("Hii", map.get(12));
        assertEquals("Hii", map.get(15));
        assertEquals("Hii", map.get(104));
    }
    /**
     * Testing the contains method
     */
    @Test
    void mapTestEight(){
        Map<Integer, String> map = makeMap();
        map.put(1, "123");
        map.put(50000,"50000");

        assertEquals(true, map.contains(1));
        assertEquals(false, map.contains(2));
        assertEquals(true, map.contains(50000));
        assertEquals(2, map.size());
    }

}

package Homework14;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MapSetTest{
    /**
     * testing add method
     */
    @Test
    void mapSetTestOne(){
        Hashmap<String, String> map = new Hashmap<>();
        Set<String> set = new MapSet<>(map);
        set.add("123");

        assertEquals(true, set.contains("123"));
    }

    /**
     * testing contains method
     */

    @Test
    void mapSetTestTwo(){
        Hashmap<String, String> map = new Hashmap<>();
        Set<String> set = new MapSet<>(map);
        set.add("123");
        set.add("hello");

        assertEquals(true, set.contains("123"));
        assertEquals(false, set.contains("apple"));
    }
    /**
     * testing the remove method
     */
    @Test
    void mapSetTestThree(){
        Hashmap<String, String> map = new Hashmap<>();
        Set<String> set = new MapSet<>(map);
        set.add("123");
        set.add("hello");
        set.remove("hello");

        assertEquals(true, set.contains("123"));
        assertEquals(false, set.contains("hello"));
    }

    /**
     * Testing remove method part 2
     */
    @Test
    void mapSetTestFour(){
        Hashmap<String, String> map = new Hashmap<>();
        Set<String> set = new MapSet<>(map);
        set.add("123");
        set.add("hello");
        set.remove("Hello");

        assertEquals(true, set.contains("123"));
        assertEquals(true, set.contains("hello"));
    }
    /**
     * Testing add method part 2 -- checking the new element is ignored if the element is the same.
     */
    @Test
    void mapSetTestFive(){
        Hashmap<String, String> map = new Hashmap<>();
        Set<String> set = new MapSet<>(map);
        set.add("123");
        set.add("123");

        assertEquals(true, set.contains("123"));
    }
}
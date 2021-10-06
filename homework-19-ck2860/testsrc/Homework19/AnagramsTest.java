package Homework19;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    /**
     * The anagram's readwords method is tested, making sure
     * we successfully create a file.
     */
    @Test
    public void TestZero() {
        try {
            Collection<String> list = new LinkedList<>();
            list = Anagrams.readWords("InputTest");
            Boolean input1 = list.contains("eta");
            Boolean input2 = list.contains("tae");
            Boolean input3 = list.contains("tea");

            assertEquals(true, input1);
            assertEquals(true, input2);
            assertEquals(true, input3);

        } catch (AnagramException e) {
            e.getMessage();
        }
    }

    /**
     * Testing the readword method when we do not enter the file correctly.
     * testing the AnagramException, making sure it prints properly
     */
    @Test
    public void TestOne() {
        try {
            Anagrams.readWords(null);
        } catch (AnagramException e) {
            e.getMessage();
            assertEquals("Error: Problem reading file", e.getMessage());
        }
    }

    /**
     * Testing the sortword method
     */
    @Test
    public void TestTwo() {
        String expected1 = Anagrams.sortWords("banana");
        String expected2 = Anagrams.sortWords("apple");
        assertEquals(expected1, "aaabnn");
        assertEquals(expected2, "aelpp");
    }

    /**
     * testing the anagrams' makeanagrams method,
     * showing that the map is successfully created.
     */
    @Test
    public void TestThree() {
        Map map = new HashMap();
        Collection<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        map = Anagrams.makeAnagrams(list);
        assertEquals(true, map.containsKey("aelpp"));
        assertEquals(true, map.containsKey("aaabnn"));
        assertEquals(false, map.containsKey("apple"));
        assertEquals(false, map.containsValue("aelpp"));
    }

    /**
     * testing the writeAnagrams method, making sure the anagram exception would return properly.
     *
     */

    @Test
    public void TestFour() {
        try {
            Map map = new HashMap();
            Collection<String> list = new LinkedList<>();
            list.add("apple");
            list.add("banana");
            map = Anagrams.makeAnagrams(list);
            Anagrams.writeAnagrams(map, null);
        } catch (AnagramException e) {
            e.getMessage();
            assertEquals("Problem writing data into file", e.getMessage());
        }
    }

    /**
     * testing the writeAnagram method, making sure that it successfully create a file and write into it.
     */
    @Test
    public void TestFive() {
        try {
            Map map = new HashMap();
            Collection<String> list = new LinkedList<>();
            list.add("apple");
            list.add("banana");
            map = Anagrams.makeAnagrams(list);
            Anagrams.writeAnagrams(map, "OutputTest");
            assertEquals(true, map.containsKey("aelpp"));
        } catch (AnagramException e) {
            e.getMessage();
        }
    }
}
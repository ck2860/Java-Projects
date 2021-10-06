package Homework19;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AnagramExceptionTest {
    /**
     * The method is used to test the AnagramException returning correctly.
     */
    @Test
    public void TestZero(){
        try {
            Anagrams.writeAnagrams(null, "OutputTest");
            fail();
        }catch (AnagramException e){
            assertEquals("Problem writing data into file", e.getMessage());
        }
    }
    /**
     * The method is used to test the AnagramException returning correctly.
     */
    @Test
    public void TestOne(){
        try {
            Map map = new HashMap();
            Collection<String> list = new LinkedList<>();
            list.add("apple");
            list.add("banana");
            map = Anagrams.makeAnagrams(list);
            Anagrams.writeAnagrams(map, null);
            fail();
        }catch (AnagramException e){
            e.getMessage();
            assertEquals("Problem writing data into file", e.getMessage());
        }
    }
    /**
     * The method is used to test the AnagramException returning correctly.
     */
    @Test
    public void TestTwo() {
        try {
            Anagrams.readWords(null);
            fail();
        } catch (AnagramException e) {
            e.getMessage();
            assertEquals("Error: Problem reading file", e.getMessage());
        }
    }
}
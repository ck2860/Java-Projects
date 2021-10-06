package Homework16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLetterTest {
    /**
     * comparing the same strings, making sure it returns 0
     */
    @Test
    public void compareTestZero(){
        StringLetter letter = new StringLetter();
        String a = "apple";
        String b = "apple";
        int input = letter.compare(a, b);

        assertEquals(0, input);
    }
    /**
     * comparing the same strings, regardless the uppercase or uppercase, making sure it returns 0
     */
    @Test
    public void compareTestOne(){
        StringLetter letter = new StringLetter();
        String a = "APPLE";
        String b = "apple";
        int input = letter.compare(a, b);

        assertEquals(0, input);
    }
    /**
     * comparing the different strings, expecting its -1.
     */
    @Test
    public void compareTestTwo(){
        StringLetter letter = new StringLetter();
        String a = "Apple";
        String b = "Banana";
        int input = letter.compare(a, b);

        assertEquals(-1, input);
    }
    /**
     * comparing the different strings, expecting its -18.
     */
    @Test
    public void compareTestThree(){
        StringLetter letter = new StringLetter();
        String a = "Apple";
        String b = "Soup";
        int input = letter.compare(a, b);

        assertEquals(-18, input);
    }
    /**
     * comparing the different strings, expecting its 18.
     */
    @Test
    public void compareTestFour(){
        StringLetter letter = new StringLetter();
        String a = "Soup";
        String b = "Apple";
        int input = letter.compare(a, b);

        assertEquals(18, input);
    }
}
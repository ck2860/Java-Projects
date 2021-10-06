package Homework15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    /**
     * testing deep equality
     */
    @Test
    void testEqualTest () {
        Pokemon Pikachu = new Pokemon("Pikachu",25);
        Pokemon Bulbasaur = new Pokemon("Bulbasaur",1);
        Pokemon Pikachu1 = new Pokemon("Pikachu",25);

        boolean input1 = Pikachu.equals(Bulbasaur);
        boolean input2 = Pikachu.equals(Pikachu1);

        assertEquals(false, input1);
        assertEquals(true, input2);
    }

    /**
     * Testing compareTo test
     */

    @Test
    void compareToTest () {
        Pokemon Pikachu = new Pokemon("Pikachu",25);
        Pokemon Ivysaur = new Pokemon("Ivysaur",2);

        int input = Pikachu.compareTo(Ivysaur);
        assertEquals(23, input);

    }
}
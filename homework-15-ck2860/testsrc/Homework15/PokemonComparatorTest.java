package Homework15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonComparatorTest {
    /**
     * Testing compareTo test
     */

    @Test
    void compareToTest () {
        PokemonComparator comparator = new PokemonComparator();

        Pokemon Pikachu = new Pokemon("Pikachu",25);
        Pokemon Ivysaur = new Pokemon("Ivysaur",2);
        BinaryNode pokemonRoot = new BinaryNode(Pikachu, comparator);

        int input = pokemonRoot.compare(Pikachu, Ivysaur);
        assertEquals(-23, input);

    }

}
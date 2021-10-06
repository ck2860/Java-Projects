package Homework15;

import java.util.Comparator;

public class PokemonComparator<T> implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Pokemon p1 = (Pokemon) o1;
        Pokemon p2 = (Pokemon) o2;
        return (p2.getNumber()- p1.getNumber()); // biggest to smallest (reverse)
    }
}

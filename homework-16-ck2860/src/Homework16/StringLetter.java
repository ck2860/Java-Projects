package Homework16;

import java.util.Comparator;

public class StringLetter implements Comparator<String> {
    /**
     * implementing a comparator interface to use compare method
     * @param o1 first string
     * @param o2 second string
     * @return the difference between first and second strings by using the compareTo method
     */
    @Override
    public int compare(String o1, String o2) {
        String a = o1.toUpperCase();
        String b = o2.toUpperCase();
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        StringLetter a = new StringLetter();

    }
}
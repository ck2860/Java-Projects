package Homework15;

public class Pokemon implements Comparable {

    private String name;
    private int number;

    /**
     * implement a constructor that takes both name and number as parameters
     */
    public Pokemon(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * the accessor for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * the accessor for number
     *
     * @return number
     */

    public int getNumber() {
        return number;
    }

    /**
     * the function returns a string in the format
     *
     * @return string.
     */

    @Override
    public String toString() {
        return getName() + "(" + getNumber() + ")";
    }
    /**
     * implement an equal(Object) method so if two pokemon are considered equal if they have the same number
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pokemon) {
            Pokemon objOne = (Pokemon) obj;
            return objOne.number == this.number;
//            return objOne.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
    /**
     * hashCode method returns the number
     */
    @Override
    public int hashCode() {
        return this.number;
    }
    /**
     * Comparable interface is used here, to get the natural order
     * so from A.compareTo(B), we want the smallest number to biggest number in the order.
     *
     * @param o object
     * @return the difference
     */

    @Override
    public int compareTo(Object o) {
        Pokemon p = (Pokemon) o; // like o2
        return (this.getNumber() - p.getNumber()); // smallest to biggest
    }
}

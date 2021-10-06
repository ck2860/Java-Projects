package Homework18.weight;

public class Tuple<T> {
    /**
     * two private fields for a tuple : a value and int weight
     */
    T value;
    int weight;

    /**
     * a constructor for a tuple..takes value and weight as parameters.
     * @param value value
     * @param weight edge's weight
     */
    public Tuple(T value, int weight){
        this.value = value;
        this.weight = weight;
    }

    /**
     * getter for weight
     * @return
     */

    public int getWeight() {
        return weight;
    }

    /**
     * getter for value
     * @return
     */
    public T getValue() {
        return value;
    }
}

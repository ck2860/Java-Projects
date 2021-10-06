package Homework14;

/**
 * key/value pairs are used as type parameter for map
 * @param <K> key
 * @param <V> value
 */

public interface Map <K,V> {
    /**
     * put a key/value pair into the map
     * @param key
     * @param value
     */
    // put
    void put (K key, V value);

    /**
     * Key is a parameter, when it is passed, we would get value from the map.
     * @param Key
     * @return the value
     */
    //get
    V get (K Key);

    /**
     * size of the map.(# of key/value pairs in the map)
     * @return the size
     */
    //size
    int size();

    /**
     * returns true if the key is in the array. Otherwise, false.
     * @param key
     * @return true or false if the key is there
     */
    boolean contains(K key);
}

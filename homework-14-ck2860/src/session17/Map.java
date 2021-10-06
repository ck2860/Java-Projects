package session17;

/**
 * key/value pairs are used as type parameter for map
 * @param <K> key
 * @param <V> value
 */

public interface Map < K,V> {
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
     * @return
     */
    //size
    int size();
}

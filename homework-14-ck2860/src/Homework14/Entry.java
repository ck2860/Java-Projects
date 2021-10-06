package Homework14;
/**
 * The type parameters for key and value. This class is implemented from map interface.
 * @param <K> key
 * @param <V> value
 */
public class Entry<K,V> implements Map<K,V>{
    /**
     * private fields for pairs: key, value
     */
    private K key;
    private V value;
    /**
     * The constructor declares fields.
     * @param key
     * @param value
     */
    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }
    /**
     * the getter for key
     * @return key
     */
    public K getKey() {
        return key;
    }
    /**
     * the getter for value
     * @return value
     */
    public V getValue() {
        return value;
    }

    /**
     * the method to add key/value pairs
     * @param key key
     * @param value value
     */

    @Override
    public void put(K key, V value) {
    }

    /**
     * hashcode is used to get a hash code and get the entry from the correct hashcode (index)
     * return the value
     * @param key
     * @return the value of key
     */

    @Override
    public V get(K key) {
        return null;
    }
    /**
     * the size of adding the key/values
     * @return size
     */
    @Override
    public int size() {
        return 0;
    }
    /**
     * returns true if the key is in the map. Otherwise, false.
     * @param key
     * @return true or false
     */
    @Override
    public boolean contains(K key) {
        return false;
    }
}


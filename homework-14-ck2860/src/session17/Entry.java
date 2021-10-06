package session17;

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
     * the method
     * @param key
     * @param value
     */

    @Override
    public void put(K key, V value) {
    }

    @Override
    public V get(K Key) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

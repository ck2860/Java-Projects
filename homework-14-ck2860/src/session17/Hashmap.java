package session17;

import java.util.Arrays;

/**
 * Two type parameters: key and value for hashmap
 * @param <K> key
 * @param <V> value
 */
public class Hashmap<K, V> implements  Map<K, V> {
    /**
     * implementing Map interface and having private fields to store an array: Entry array and size.
     */
    private Entry<K, V>[] array;
    private int size;
    /**
     * constructor to create an array that holds 100 entries.
     */
    public Hashmap(){
        array = (Entry<K,V>[])new Entry[100];
        size = 0;
    }

    /**
     *HashCode() function is used to get a hash code.
     * create an entry and use the hashcode as an index to store the
     * entry in your array.
     * @param key
     * @param value
     */

    //put
    @Override
    public void put(K key, V value) {
//        int hashCode = key.hashCode();
        //int index = index(key);
        if (1.0*size / array.length >= .75) {
            Entry<K, V>[] oldArray = array;
            array = (Entry<K,V>[])new Entry[2*array.length];
            for (int i = 0; i < oldArray.length; i ++){
                if (oldArray[i] != null){
//                    this.array[i] = oldArray[i];
                    put(key, value);
                }
            }
//            array = Arrays.copyOf(array, 2*array.length);
        }
        int index = openAddress(key);
        Entry<K,V> entry = new Entry<>(key, value);
        array[index] = entry;
//        array[hashCode] = entry;
        size ++;
    }

    /**
     * hashcode is used to get a hash code and get the entry from the correct hashcode (index)
     * return the value
     * @param key
     * @return the value of key
     */

    //get
    @Override
    public V get(K key) {
//        int hashCode = key.hashCode();
        int index = index(key);
//        Entry <K, V>  entry = array[hashCode];
        Entry <K,V> entry = array[index];
        return entry != null ? entry.getValue() : null;
    }

    //size
    @Override
    public int size() {
        return size;
    }

    private int index (K key){
        int hashCode = key.hashCode();
        int index = hashCode % array.length;
        Math.abs(index); // making sure the index is positive?
        return index;
    }

    public int openAddress(K key ){
        int searchIndex = index(key);
        for (int i = searchIndex; searchIndex < array.length; i++){
            if (array[i] == null){
                return i;
            }
        }
        for (int i = 0; i < searchIndex; i++){
            if (array[i] == null){
                return i;
            }
        }
        return -1;
    }
}

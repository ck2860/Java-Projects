package Homework14;

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
        if ((float) size / array.length >= .75) {
            Entry<K, V>[] oldArray = array;
            array = (Entry<K, V>[]) new Entry[2 * array.length];
            for (int i = 0; i < oldArray.length; i++) {
                if (oldArray[i] !=  null) {
                    //int index = index(key);
                    int index = index(oldArray[i].getKey());
                    array[index] = oldArray[i];
//                    System.out.println(index);
//                    put(oldArray[i].getKey(), oldArray[i].getValue());
                }
            }
        }
        //try to get(key)
        //if not null
        //  replace old value with new value
        if (get(key) !=null){
            int index = index(key);
            for (int i = index; i < array.length+index; i++) {
                int idex = i % array.length;
                if (array[idex] != null) {
//                System.out.println(idex);
                    if (array[idex].getKey().equals(key)) {
                        Entry<K, V> entry = new Entry<>(key, value);
                        array[idex] = entry;
                        break;
                    }
                }
            }
        }
        //if null:
        else {
            int index = openAddress(key);
            Entry<K, V> entry = new Entry<>(key, value);
            array[index] = entry;
            size++;
        }
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
        for (int i = index; i < array.length; i++){
            if(array[i] != null) {
                if (array[i].getKey().equals(key)) {
                    return array[i].getValue();
                }
            } // it's removed or not here
        }
        return null;
    }
    /**
     * adding the remove method for the mapset.
     * When you call the key value, you set it null again.
     * @param key
     */

    public void remove(K key) {
        int index = index(key);
        for (int i = index; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].getKey().equals(key)) {
                    array[i] = null;
                }
            }
        }
    }

    /**
     * the size of adding the key/values
     * @return size
     */
    //size
    @Override
    public int size() {
        return size;
    }
    /**
     * returns true if the key is in the map. Otherwise, false.
     * @param key
     * @return true or false
     */
    @Override
    public boolean contains(K key) {
        int index = index(key);
        for (int i = index; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].getKey().equals(key)) {
                    return true;
                }
            }
        }for (int i = 0; i < index; i++){
            if (array[i] != null) {
                if (array[i].getKey().equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * index of the key
     * @param key
     * @return index
     */

    protected int index (K key){
        int hashCode = key.hashCode();
//        System.out.println(hashCode);
        int index = Math.abs((hashCode % array.length));
        return index;
    }

    /**
     * Open address is the method to avoid collisions -- allowing the index moving to the next place if its filled, etc..
     * @param key
     * @return an index.
     */

    public int openAddress(K key){
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
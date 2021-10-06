package Homework14;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * implementing Map interface
 * @param <K> key
 * @param <V> value
 */
public class ChainingHashmap<K, V> implements Map<K,V> {

    private ArrayList<Entry<K, V>>[] array;
    //    private int amount;
    private int size;

    /**
     * constructor to create an array that holds 100 entries.
     */
    public ChainingHashmap() {
        array = (ArrayList<Entry<K, V>>[]) new ArrayList[100]; //ArrayList<Entry<K,V>>
        //loop through array and make new ArrayList() at each index
        for (int i = 0; i < array.length; i++) {
            array[i] = new ArrayList<>();
        }
        size = 0;
    }
    /**
     * The put method is to add keys and values in the array list.
     * If we use the same key, it shall replace them
     *
     * @param key key
     * @param value  value
     */
    @Override
    public void put(K key, V value) {
        if ((float)size/array.length >= .75) {
//            array = Arrays.copyOf(array, 2*array.length);
            ArrayList<Entry<K, V>>[] oldArray = array;
            array = (ArrayList<Entry<K, V>>[]) new ArrayList[2 * array.length];
            for (int j = 0; j < array.length; j++) {
                    array[j] = new ArrayList<>();
            }
            for (int i = 0; i < oldArray.length; i++) {
                if (oldArray[i] != null) {
                    for(int j = 0; j < oldArray[i].size(); j++) {
                        int index = index(oldArray[i].get(j).getKey());
                        array[index].add(oldArray[i].get(j));
                    }
                }
            }
        }
        if (get(key) !=null) {
            int index = index(key);
            for (int i = 0; i < array[index].size(); i++) {
                if (array[index].get(i).getKey().equals(key)) {
                    Entry<K, V> entry = new Entry<>(key, value);
                    array[index].set(i,entry);
                    break;
                }
            }
        } else {
            int index = index(key);
            Entry<K, V> entry = new Entry<>(key, value);
            array[index].add(entry);
            size++;
        }
    }

    /**
     * We use this function to get the value by giving the key.
     * If not, we would return null
     * @param key key
     * @return key's value
     */

    @Override
    public V get(K key) {
        int index = index(key);
        ArrayList<Entry<K,V>> entry = array[index];
        for (int i = 0; i < entry.size(); i++) {
            if (entry.get(i).getKey().equals(key)) {
                return entry.get(i).getValue();
            }
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
        ArrayList<Entry<K,V>> entry = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] != null) {
                if (entry.get(i).getKey().equals(key)) {
                    array[i] = null;
                }
            }
        }
    }

    /**
     * the size of elements
     * @return size
     */

    @Override
    public int size() {
        return size;
    }
    /**
     * returns true if the key is in the list. Otherwise, false.
     * @param key
     * @return true or false
     */
    @Override
    public boolean contains(K key) {
        int index = index(key);
        ArrayList<Entry<K,V>> entry = array[index];
        for (int i = 0; i < entry.size(); i++) {
            if (entry.get(i).getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * index of the key
     * @param key key
     * @return index
     */
    private int index(K key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % array.length);
        return index;
    }

    public static void main(String[] args) {
        ChainingHashmap test = new ChainingHashmap();
        System.out.println(test.contains("appke"));
        test.put("Banana", "hello");
        System.out.println(test.contains("Banana"));
        System.out.println(test.contains("hello"));
        System.out.println();
        System.out.println();

    }

}
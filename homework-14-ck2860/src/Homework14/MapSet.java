package Homework14;

public class MapSet<E> implements  Set<E>{
    private Hashmap<E, E> map;
//    private Set<E> set;
//    private final Map <E,E> map;
    private int size;
//    public MapSet(Map<E, E> map){
//        this.map =  map;
//        size = 0;
//    }

    public MapSet(Hashmap<String, String> map){
        this.map = new Hashmap<>();
    }
    /**
     * Adding elements into the set.
     * If the same element(according to equals(Object)) is already in the set, ignore the new element.
     * @param element
     */

    @Override
    public void add(E element) {
        if (!map.contains(element)) {
            map.put(element, null);
            size++;
        }
    }

    /**
     * removing elements from the set.
     * @param element
     */

    @Override
    public void remove(E element) {
        if (map.contains(element)) {
            map.remove(element);
        }
    }

    /**
     * returns true if the element is in the set. Otherwise, false.
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        return map.contains(element);
    }

    @Override
    public int size() {
        return size;
    }
}


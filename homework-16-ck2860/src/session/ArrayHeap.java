package session;

import java.util.Arrays;

/**
 * An array-based implementation of a heap data structure.
 */
public class ArrayHeap implements Heap{
    private int [] array;
    private int size;

    public ArrayHeap (){
        array = new int [8];
        size = 0;
    }


    /**
     * Sifts a value up from the specified index in a heap.
     *
     * @param array The heap.
     * @param index The index to begin sifting up.
     */
    static void siftUp(int[] array, int index) {
        int parent = (index - 1) / 2;
        while(array[parent] > array[index]) {
            swap(array, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * Sifts a value down from the root in a heap.
     *
     * @param array The heap.
     * @param size The size of the heap.
     */
    static void siftDown(int[] array, int size) {
        int to = 0;
        int from;
        do {
            from = to;

            int left = 2 * from + 1;
            int right = left + 1;
            if(left < size && array[left] < array[to]) {
                to = left;
            }

            if(right < size && array[right] < array[to]) {
                to = right;
            }

            swap(array, from, to);

        } while(from != to);
    }

    /**
     * Swaps the values at the specified indexes.
     *
     * @param array The array in which the values should be swapped.
     * @param from The first index.
     * @param to The second index.
     */
    static void swap(int[] array, int from, int to) {
        if(from != to) {
            int tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
        }
    }

    @Override
    public void add(int value) {
        if (array.length == size){
            array = Arrays.copyOf(array, size*2);
        }
        array[size] = value;
        size++;
        siftUp(array, size-1);
    }

    @Override
    public void add(int... values){
        for(int value: values){
            add(value);
        }
    }

    @Override
    public int remove() {
        int root = array[0];
        size--;
        swap(array, 0, size);
        array[size] = 0;

        siftDown(array, size);

        return root;
    }

    @Override
    public int size() {
        return size;
    }


    public static void main(String[] args) {
        Heap heap = new ArrayHeap();
        heap.add(9);
        heap.add(1);
        heap.add(2);
        heap.add(7);
        heap.add(5);
        heap.add(4);
        heap.add(0);
        heap.add(6);
        heap.add(3);
        heap.add(8);

        while(heap.size() > 0){
            System.out.println(heap.remove());
        }
    }
}

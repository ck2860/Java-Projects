package session14;

import static session14.SortUtilities.*; // import from sort class

public class Sorts {
    public static void insertionSort(int [] array){
        for (int partition = 1; partition<array.length; partition++){
           int index = partition;
           while(index > 0 && array[index] < array[index-1]){
               swap(array, index, index-1);
               index --;
           }
        }
    }



    public static int [] mergeSort(int [] array){
        if (array.length < 2){
            return array;
        }else{
            int [][] arrays = divide2(array); // divide into two arrays first //arrays[0] = first array, arrays[1] = second array
            int[] sortedArrayOne = mergeSort(arrays[0]); // then call the mergeSort function secondly then divide into two arrays then base call-- keeps two arrays
            int[] sortedArrayTwo = mergeSort(arrays[1]);
            return merge(sortedArrayOne, sortedArrayTwo);
        }
    }

    public static void main(String[] args) {
        int[] array1 = makeArray(10);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        System.out.println("______insertion______");
        insertionSort(array1);
        for (int value : array1) {
            System.out.print(value);
        }
    }
}
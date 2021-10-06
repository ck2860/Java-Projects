package session14;
import java.util.Random;

public class SortUtilities {
    private static final Random RNG = new Random(1);

    public static boolean sorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] array, int a, int b) {
        int aValue = array[a];
        int bValue = array[b];
        array[a] = bValue;
        array[b] = aValue;
//        for (int i = 1; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }

    public static int[] makeArray(int size) {
        int[] array = new int[size];
        for (int i = 1; i < array.length; i++) {
            array[i] = RNG.nextInt(size);
        }
        return array;
    }

    public static int[][] divide(int[] array) { // split an array into two arrays by selecting evens and odds.
        int[] arrayOdds = new int[array.length / 2];
        int[] arrayEvens = new int[array.length - arrayOdds.length];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                arrayEvens[evenIndex] = array[i];
                evenIndex++;
            } else {
                arrayOdds[oddIndex] = array[i];
                oddIndex++;
            }
        }
        return new int[][]{arrayEvens, arrayOdds};
    }

    public static int[][] divide1(int[] array) {  //split an array into two arrays by middle.
        int[] leftArray = new int[array.length / 2];
        int[] rightArray = new int[array.length - leftArray.length];

        int middle = array.length / 2;
        for (int i = 0; i < array.length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - middle] = array[i];
            }
        }
        return new int[][]{leftArray, rightArray};
    }

    public static int[][] divide2(int[] array) { // split an array into two arrays by selecting evens and odds.
        int[] arrayEvens;
        int[] arrayOdds;
        if (array.length % 2 == 0) {
            arrayEvens = new int[(array.length / 2)];
            arrayOdds = new int[array.length - arrayEvens.length];
        } else {
            arrayEvens = new int[(array.length / 2) + 1];
            arrayOdds = new int[array.length - arrayEvens.length];
        }
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                arrayEvens[evenIndex] = array[i];
                evenIndex++;
            } else {
                arrayOdds[oddIndex] = array[i];
                oddIndex++;
            }
        }
        return new int[][]{arrayEvens, arrayOdds}; // EX: array[0] = ArrayEvens, array[1] = arrayOdds.
    }

    public static int[] merge(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (aIndex >= a.length) {
                mergedArray[i] = b[bIndex];
                bIndex++;
                continue;
            }
            if (bIndex >= b.length) {
                mergedArray[i] = a[aIndex];
                aIndex++;
                continue;
            }
            if (a[aIndex] < b[bIndex]) {
                mergedArray[i] = a[aIndex];
                aIndex++;
            } else {
                mergedArray[i] = b[bIndex];
                bIndex++;
            }
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = makeArray(10);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("______merged______");
        int[] array = Sorts.mergeSort(array1);
        for (int arr1 : array) {
            System.out.println(arr1);
        }
    }
}
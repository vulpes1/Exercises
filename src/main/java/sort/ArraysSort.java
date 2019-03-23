package sort;

import java.util.Arrays;

public class ArraysSort implements SortingMethod {

    public int[] sort(int[] arrayToSort) {
        Arrays.sort(arrayToSort);
        return arrayToSort;
    }
}

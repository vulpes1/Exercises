package sort;

import java.util.Arrays;

public class SelectionSort implements SortingMethod {

    public int[] sort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    swapNumbers(arrayToSort, i, j);
                }
            }
        }
        return arrayToSort;
    }

    private void swapNumbers(int[] arrayToSort, int i, int j) {
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 45, 6, 1};
        new SelectionSort().sort(a);
        System.out.println(Arrays.toString(a));
    }
}
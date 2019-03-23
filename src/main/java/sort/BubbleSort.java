package sort;

public class BubbleSort implements SortingMethod {

    private static void swapNumbers(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }

    public int[] sort(int[] arrayToSort) {
        for (int j = 1; j < arrayToSort.length; j++) {
            for (int i = 1; i <= arrayToSort.length - j; i++) {
                if (arrayToSort[i-1] > arrayToSort[i]) {
                    swapNumbers(arrayToSort, i);
                }
            }
        }
        return arrayToSort;
    }
}
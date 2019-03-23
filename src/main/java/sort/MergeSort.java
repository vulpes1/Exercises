package sort;

public class MergeSort implements SortingMethod {

    public int[] sort(int[] arrayToSort) {
        int[] temporaryArray = new int[arrayToSort.length];
        mergeSort(arrayToSort, 0, arrayToSort.length - 1);
        return arrayToSort;
    }

    private static void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int midpoint = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, midpoint);
            mergeSort(array, midpoint + 1, rightIndex);
            merge(array, leftIndex, midpoint, rightIndex);
        }
    }

    private static void merge(int[] array, int leftIndex, int midpoint, int rightIndex) {
        int[] temporaryArray = new int[array.length];
        for (int i = leftIndex; i <= rightIndex; i++) {
            temporaryArray[i] = array[i];
        }
        int leftArrayIndex = leftIndex;
        int rightArrayIndex = midpoint + 1;
        int tempIndex = leftIndex;

        while ((leftArrayIndex <= midpoint) && (rightArrayIndex <= rightIndex)) {
            if (temporaryArray[leftArrayIndex] <= temporaryArray[rightArrayIndex]) {
                array[tempIndex] = temporaryArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                array[tempIndex] = temporaryArray[rightArrayIndex];
                rightArrayIndex++;
            }
            tempIndex++;
        }
        while (leftArrayIndex <= midpoint) {
            array[tempIndex] = temporaryArray[leftArrayIndex];
            leftArrayIndex++;
            tempIndex++;
        }
    }
}
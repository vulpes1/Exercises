package sort;

public class HeapSort implements SortingMethod {

    public int[] sort(int[] arrayToSort) {
        int n = arrayToSort.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            HeapSort.adjustkMaxHeap(arrayToSort, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            swap(arrayToSort, 0, i);
            adjustkMaxHeap(arrayToSort, --n, 0);
        }
        return arrayToSort;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void adjustkMaxHeap(int[] array, int heapSize, int parentIndex) {
        int maxIndex = parentIndex;
        int leftChild = parentIndex * 2 + 1;
        int rightChild = parentIndex * 2 + 2;

        if (leftChild < heapSize && array[leftChild] > array[maxIndex]) {
            maxIndex = leftChild;
        }
        if (rightChild < heapSize && array[rightChild] > array[maxIndex]) {
            maxIndex = rightChild;
        }
        if (maxIndex != parentIndex) {
            swap(array, maxIndex, parentIndex);
            adjustkMaxHeap(array, heapSize, maxIndex);
        }
    }
}

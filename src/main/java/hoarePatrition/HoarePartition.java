package hoarePatrition;

import java.util.Arrays;

public class HoarePartition {

    public static int[] swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
        return array;
    }

    public static int[] createHoarePartitionArray(int[] array, int pivotIndex) {
        int pivot = array[pivotIndex];
        swap(array, 0, pivotIndex);

        int indexL = 1;
        int indexR = array.length - 1;
        while (indexL < indexR) {
            while (array[indexL] <= pivot) {
                indexL++;
            }
            while (array[indexR] > pivot) {
                indexR--;
            }

            if (array[indexL] > pivot && array[indexR] <= pivot && (indexL < indexR)) {
                swap(array, indexL, indexR);
                indexL++;
                indexR--;
            }
        }

        if (array[indexL] > pivot) {
            swap(array, 0, indexL - 1);
        } else {
            swap(array, 0, indexL);
        }
        return array;
    }

    public static void printHoarePertitinonArray(int[] array, int pivotIndex) {
        int pivot = array[pivotIndex];
        System.out.println(Arrays.toString(createHoarePartitionArray(array, pivotIndex)));
        System.out.println("Pivot value: " + pivot);
    }

    public static void main(String[] args) {
        printHoarePertitinonArray(new int[]{15, 1, 25, 77, 42, 53, 13, 12, 11, 2, 8, 5, 4, 17, 3, 2, 1}, 8);
    }
}

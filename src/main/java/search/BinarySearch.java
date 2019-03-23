package search;

import java.util.Arrays;

public class BinarySearch implements FindIndex {

    private static int[] sort(int[] arrayToSort) {
        Arrays.sort(arrayToSort);
        return arrayToSort;
    }

    public int findIndexOfElement(int[] unsortedArray, int element) {
        int[] sortedArray = sort(unsortedArray);
        int lowerIndex = 0;
        int higherIndex = sortedArray.length - 1;

        while (lowerIndex < higherIndex) {
            int middleIndex = (lowerIndex + higherIndex) / 2;

            if (element <= sortedArray[middleIndex]) {
                higherIndex = middleIndex;
            } else {
                lowerIndex = middleIndex + 1;
            }
        }
        if (element == sortedArray[higherIndex]) {
            return higherIndex;
        }
        return -1;
    }
}
package sort;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort implements SortingMethod {

    public int[] sort(int[] arrayToSort) {
        ArrayList<Integer> list = new ArrayList<>(arrayToSort.length);
        for (int i = 0; i < arrayToSort.length; i++) {
            list.add(arrayToSort[i]);
        }
        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

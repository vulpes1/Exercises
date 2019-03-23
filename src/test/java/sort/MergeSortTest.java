package sort;

public class MergeSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new MergeSort();
    }
}

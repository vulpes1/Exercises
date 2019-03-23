package sort;

public class HeapSortTest extends SortingTestBase{

    @Override
    public SortingMethod getSortingMethod() {
        return new HeapSort();
    }
}
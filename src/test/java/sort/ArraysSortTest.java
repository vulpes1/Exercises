package sort;

public class ArraysSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new ArraysSort();
    }
}
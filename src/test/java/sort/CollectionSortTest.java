package sort;

public class CollectionSortTest extends SortingTestBase {

    @Override
    public SortingMethod getSortingMethod() {
        return new CollectionSort();
    }
}
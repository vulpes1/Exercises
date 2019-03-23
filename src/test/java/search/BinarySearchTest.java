package search;

public class BinarySearchTest extends SortingTestBase {

    @Override
    public FindIndex getSortingMethod() {
        return new BinarySearch();
    }
}
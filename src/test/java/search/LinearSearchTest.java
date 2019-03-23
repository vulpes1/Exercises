package search;

public class LinearSearchTest extends SortingTestBase {

    @Override
    public FindIndex getSortingMethod() {
        return new LinearSearch();
    }
}
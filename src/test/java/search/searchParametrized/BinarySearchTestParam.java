package search.searchParametrized;


import search.BinarySearch;
import search.FindIndex;

public class BinarySearchTestParam extends SortingTestBaseParam {
    @Override
    public FindIndex getSortingMethod() {
        return new BinarySearch();
    }
}
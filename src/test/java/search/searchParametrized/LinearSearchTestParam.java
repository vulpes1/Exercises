package search.searchParametrized;


import search.FindIndex;
import search.LinearSearch;

public class LinearSearchTestParam extends SortingTestBaseParam {
    @Override
    public FindIndex getSortingMethod() {
        return new LinearSearch();
    }
}

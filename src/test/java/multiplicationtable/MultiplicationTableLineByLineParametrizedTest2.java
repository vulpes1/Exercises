package multiplicationtable;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MultiplicationTableLineByLineParametrizedTest2 {

    @Test
    @Parameters(method = "dataForTesting")
    public void multiplicationTableSingleResultVerification(int size, int row, int column, int expected) {
        int result = MultiplicationTableLineByLine.createMultiplicationTable(size)[row - 1][column - 1];
        assertThat(result, is(equalTo(expected)));
    }

    private Object[] dataForTesting() {
        return new Object[]{
                new Object[]{7, 5, 2, 10},
                new Object[]{12, 11, 11, 121},
                new Object[]{120, 47, 96, 4512},
                new Object[]{4322, 735, 473, 347655},
        };
    }
}
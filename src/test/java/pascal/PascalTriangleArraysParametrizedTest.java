package pascal;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static pascal.PascalTriangleArrays.binominalCoefficient;
import static pascal.PascalTriangleArrays.createPascalTriangle;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PascalTriangleArraysParametrizedTest {

    @Test
    @Parameters(method = "dataForPascalTriangleTesting")
    public void shouldVerifyChosenRowOfPascalTriangle(int rowsNumber, int[] expected) {
        int[][] result = createPascalTriangle(rowsNumber);
        assertThat(result[rowsNumber - 1], is(equalTo(expected)));
    }

    public Object[] dataForPascalTriangleTesting() {
        return $(
                $(4, new int[]{1, 3, 3, 1}),
                $(14, new int[]{1, 13, 78, 286, 715, 1287, 1716, 1716, 1287, 715, 286, 78, 13, 1}),
                $(9, new int[]{1, 8, 28, 56, 70, 56, 28, 8, 1})
        );
    }

    @Test
    @Parameters(method = "dataForBinominalCoefficientTest")
    public void shouldVerifyBinominalCoefficient(int n, int k, int expected) {
        assertThat(binominalCoefficient(n, k), is(equalTo(expected)));
    }

    public Object[] dataForBinominalCoefficientTest() {
        return new Object[]{
                new Object[]{8, 2, 28},
                new Object[]{17, 12, 6188},
                new Object[]{14, 5, 2002},
                new Object[]{28, 14, 40116600},
        };
    }
}
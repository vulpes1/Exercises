package multiplicationtable;

import static org.junit.Assert.assertArrayEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MultiplicationTableLineByLineParametrizedTest {

    @Parameters(method = "parametersForTest")
    @Test
    public void multiplicationTableIntArray(int input, int size, int[] expected) {
        int[] resut = MultiplicationTableLineByLine.createMultiplicationTable(size)[input - 1];
        assertArrayEquals(expected, resut);
    }

    private Object parametersForTest() {
        return new Object[][]{
            {3, 10, new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30}},
            {3, 5, new int[]{3, 6, 9, 12, 15}},
            {12, 12, new int[]{12, 24, 36, 48, 60, 72, 84, 96, 108, 120, 132, 144}},
            {1, 2, new int[]{1, 2}},

//                new Object[]{3, 10, new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30}},
//                new Object[]{3, 5, new int[]{3, 6, 9, 12, 15}},
//                new Object[]{12, 12, new int[]{12, 24, 36, 48, 60, 72, 84, 96, 108, 120, 132, 144}},
//                new Object[]{1, 2, new int[]{1, 2}},
        };
    }
}

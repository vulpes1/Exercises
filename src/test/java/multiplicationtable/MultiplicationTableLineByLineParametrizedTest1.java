package multiplicationtable;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MultiplicationTableLineByLineParametrizedTest1 {

    @Test
    @Parameters(method = "parametersForTesting")
    public void multiTabIntArraySecondVersion(int size, int rowNumber, int[] expected) {
        int result[] = MultiplicationTableLineByLine.createMultiplicationTable(size)[rowNumber - 1];
        assertThat(result, is(equalTo(expected)));
    }

    private Object parametersForTesting() {
        return $(
                $(12, 4, new int[]{4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48}),
                $(6, 5, new int[]{5, 10, 15, 20, 25, 30}),
                $(1, 1, new int[]{1}),
                $(4, 4, new int[]{4, 8, 12, 16}),
                $(30, 28, new int[]{28, 56, 84, 112, 140, 168, 196, 224, 252, 280, 308, 336, 364, 392, 420, 448, 476, 504, 532, 560, 588, 616, 644, 672, 700, 728, 756, 784, 812, 840})
        );
    }
}
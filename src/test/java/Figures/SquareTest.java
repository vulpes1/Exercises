package Figures;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class SquareTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyAreaOfSquare(double base, double expected) {
        Square square = new Square(base);
        double result = square.calculateArea();
        assertThat(result, is(equalTo(expected)));
    }

    public Object[] dataForTesting() {
        return new Object[]{
                new Object[]{2, 4},
                new Object[]{0.1, 0.01},
                new Object[]{1.5, 2.25},
                new Object[]{0, 0},
                new Object[]{-1, 1},
                new Object[]{12, 144},
        };
    }
}
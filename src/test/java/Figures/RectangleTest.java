package Figures;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RectangleTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyAreaOfRectangle(double base, double side, double expected) {
        Rectangle rectangle = new Rectangle(base, side);
        double result = rectangle.calculateArea();
        assertThat(result, is(equalTo(expected)));
    }

    public Object[] dataForTesting() {
        return new Object[]{
                new Object[]{10, 20, 200.000},
                new Object[]{0.1, 0.2, 0.02},
                new Object[]{0, 100, 0.000},
                new Object[]{2.5, 2.5, 6.250},
                new Object[]{Math.PI, Math.sqrt(2), 4.443},
//                new Object[]{Math.PI, Math.sqrt(2), 4.442882938158366},
                new Object[]{1, 1, 1.000}
        };
    }
}
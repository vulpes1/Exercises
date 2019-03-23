package Figures;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TriangleTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyAreaOfTriangle(double height, double base, double expected) {
        Triangle triangle = new Triangle(height, base);
        double result = triangle.calculateArea();
        assertThat(result, is(equalTo(expected)));
    }

    public Object[] dataForTesting() {
        return new Object[]{
                new Object[]{2, 7, 7},
                new Object[]{-1, -10, 5},
                new Object[]{-1, 6, -3},
                new Object[]{0, 4, 0},
                new Object[]{1, 0.1, 0.05}
        };
    }
}
package Figures;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CircleTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyAreaOfCircle(double radius, double expected) {
        Circle circle = new Circle(radius);
        double result = circle.calculateArea();
        assertThat(result, is(equalTo(expected)));
    }

    public Object[] dataForTesting() {
        return new Object[]{
                new Object[]{3.55, 39.59192141686537},
                new Object[]{10, 314.1592653589793},
                new Object[]{178.88, 100524.85263220654},
                new Object[]{3.3333, 34.905886911676454},
                new Object[]{0.01, 3.141592653589793E-4}
        };
    }
}
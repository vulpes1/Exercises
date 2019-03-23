package Figures;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TrapezoidTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyAreaOfTrapezoid(double lowerBase, double upperBase, double height, double expected) {
        Trapezoid trapezoid = new Trapezoid(lowerBase, upperBase, height);
        double result = trapezoid.calculateArea();
        assertThat(result, is(equalTo(expected)));
    }

    public Object[] dataForTesting() {
        return new Object[]{
                new Object[]{10, 6, 3.5, 28},
                new Object[]{3, 0.1, 80, 124},
                new Object[]{15, 13, 11, 154},
                new Object[]{1234, 45634, 4.333234, 101545.005556},
                new Object[]{123, 5, 0, 0}
        };
    }
}
package fibonacci;

import static fibonacci.FiboRecursive.getFiboRecursive;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FiboRecursiveParametrizedTest {

    @Parameter()
    public int p1;
    @Parameter(1)
    public int expected;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{3, 1}, {12, 89}, {35, 5702887}};
        return Arrays.asList(data);
    }

    @Test
    public void sholudTestFiboNumbers() {
        assertEquals("Expected", expected, getFiboRecursive(p1));
    }
}
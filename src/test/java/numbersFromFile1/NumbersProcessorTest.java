package numbersFromFile1;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NumbersProcessorTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyProcessLine(String inputLine, String expected) {
        String resultLine = new NumbersProcessor().processLine(inputLine);
        assertThat(resultLine, is(equalTo(expected)));
    }

    public Object[] dataForTesting() {
        String line1 = "1 2 3 4 5";
        String line2 = "1 3 5";
        String line3 = "6 5 4 3 2 1";
        String line4 = "1 -1 1 -1";

        return new Object[]{
                new Object[]{line1, "1 + 2 + 3 + 4 + 5 = 15"},
                new Object[]{line2, "1 + 3 + 5 = 9"},
                new Object[]{line3, "6 + 5 + 4 + 3 + 2 + 1 = 21"},
                new Object[]{line4, "1 + -1 + 1 + -1 = 0"},
        };
    }
}
package numbersFromFile1;

import static numbersFromFile1.NumbersStringGenerator.createAdditionString;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NumbersStringGeneratorTest {

    @Test
    @Parameters(method = "dataForTesting")

    public void shouldVerifyGeneratorOfNumbersString(String input, String expected) {

        String result = createAdditionString(input);
        assertThat(result, is(equalTo(expected)));
    }

    public Object[] dataForTesting(){
        return new Object[]{
                new Object[]{"1 3   12 3    6","1 + 3 + 12 + 3 + 6 = "},
                new Object[]{"1 3   45   3  ", "1 + 3 + 45 + 3 = "},
                new Object[]{"56 34 23   23 34 45  ", "56 + 34 + 23 + 23 + 34 + 45 = "},
                new Object[]{"       -4              ", "-4 = "}
        };
    }
}
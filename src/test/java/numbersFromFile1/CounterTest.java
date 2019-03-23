package numbersFromFile1;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CounterTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyResultOfAddition(String input, String expected) {
        String result = Counter.countTotal(input);
        assertThat(result, is(equalTo(expected)));
    }

    public Object[] dataForTesting() {
        return new Object[]{
                new Object[]{"1 2 3 4 5", "15"},
                new Object[]{"2 4 3 1 2", "12"},
                new Object[]{"1 0 1 0 1 0 1 0 1 0", "5"},
                new Object[]{"0", "0"},
                new Object[]{"11 11 11 11", "44"}
        };
    }
}

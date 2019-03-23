package regex;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RegexParametrizedTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyIsIpAddress(String input) {
        boolean expected = false;
        boolean result = new Regex().isIpAddress(input);

        assertThat(result, is(equalTo(expected)));
    }

    public Object dataForTesting() {
        return new Object[]{
                new Object[]{"123.345.255.37w"},
                new Object[]{"000.000.111.376"},
                new Object[]{"asd.432.555.012"},
                new Object[]{"0.1.2.-1"}
        };
    }
}
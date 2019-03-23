package sieve;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static sieve.SieveOfEratosthenes.getSieve;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class SieveOfEratosthenesParametrizedTest {

    @Test
    @Parameters(method = "dataForTestingSieve")
    public void sieveVerifictionForSingleNumber(int input, int expected) {
        assertThat(getSieve(input + 1)[input], is(equalTo(expected)));
    }

    private Object[] dataForTestingSieve() {
        return new Object[]{
                new Object[]{1, 0},
                new Object[]{3, 3},
                new Object[]{234121, 234121},
                new Object[]{135, 0},
                new Object[]{5, 5},
                new Object[]{1234735, 0}
        };
    }
}
package isFiboNumber;

import static isFiboNumber.IsFiboNumberMatrixPower.isFiboNumber;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class IsFiboNumberMatrixPowerTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyIfNumberIsFiboNumber(long number, boolean flag) {
        boolean result = isFiboNumber(number);
        assertThat(result, is(equalTo(flag)));
    }

    public Object[] dataForTesting() {
        return new Object[]{
                new Object[]{8, true},
                new Object[]{61305790721611591L, true},
                new Object[]{4052739537881L, true},
                new Object[]{Long.MAX_VALUE, false},
                new Object[]{0, true},
                new Object[]{-1, false},
                new Object[]{1, true},
                new Object[]{Integer.MAX_VALUE, false}
        };
    }
}

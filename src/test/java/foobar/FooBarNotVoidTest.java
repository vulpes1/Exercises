package foobar;

import static foobar.FooBarNotVoid.barOrFooBar;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FooBarNotVoidTest {

    @Test
    @Parameters({"3", "9", "12", "18", "21"})
    public void shouldVerifyNumbersDivisibleByThree(int number) {
        List<String> list = barOrFooBar(number);
        String result = list.get(number - 1);
        assertThat(result, is(equalTo(number + "Foo")));
    }

    @Test
    @Parameters({"5", "10", "20", "35", "125"})
    public void shouldVerifyNumbersDivisibleByFive(int number) {
        List<String> list = barOrFooBar(number);
        String result = list.get(number - 1);
        assertThat(result, is(equalTo(number + "Bar")));
    }

    @Test
    @Parameters({"15", "45", "60", "120"})
    public void shouldVerifyNumbersDivisibleByFifteen(int number) {
        assertThat(barOrFooBar(number).get(number - 1), is(equalTo(number + "FooBar")));
    }

    @Test
    @Parameters({"1", "2", "4", "7", "178"})
    public void shouldVerifyNumbersNotDivisibleByFiveAndThree(int number) {
        List<String> list = barOrFooBar(number);
        String result = list.get(number - 1);
        assertThat(result, is(equalTo(String.valueOf(number))));
    }
}
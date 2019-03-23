package sieve;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static sieve.SieveOfEratosthenes.getSieve;

import org.junit.Test;

public class SieveOfEratosthenesTest {

    @Test
    public void shouldVerifyFirstElementOfSieve() {
        int input = 0;
        int expected = 0;
        assertEquals(expected, getSieve(input+1)[input]);
    }

    @Test
    public void shouldVerifySecondElementOfSieve() {
        int input = 1;
        int expected = 0;
        assertEquals(expected, getSieve(input+1)[input]);
    }

    @Test
    public void shouldVerify3rdElementOfSieve() {
        int input = 2;
        int expected = 2;
        assertThat(expected, is(equalTo(getSieve(input+1)[input])));
    }
    @Test
    public void shouldVerify9thElementOfSieve() {
        int input = 8;
        int expected = 0;
        assertThat(expected, is(equalTo(getSieve(input + 1)[input])));
    }

    @Test
    public void shouldVerify234122ndElementOfSieve() {
        int input = 234121;
        int expected = 234121;
        assertThat(expected, is(equalTo(getSieve(input + 1)[input])));
    }
}
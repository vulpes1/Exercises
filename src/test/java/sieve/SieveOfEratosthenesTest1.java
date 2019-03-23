package sieve;

import static org.junit.Assert.assertArrayEquals;
import static sieve.SieveOfEratosthenes.getSieve;

import org.junit.Test;

public class SieveOfEratosthenesTest1 {

    @Test
    public void shouldVerifySieveFor6() {
        int input = 6;
        int[] expected = {0, 0, 2, 3, 0, 5};
        int[] result = getSieve(input);
        assertArrayEquals(expected, result);

    }
    @Test
    public void shouldVerifySieveFor25() {
        int input = 25;
        int[] expected = {0, 0, 2, 3, 0, 5, 0, 7, 0, 0, 0, 11, 0, 13, 0, 0, 0, 17, 0, 19, 0, 0, 0, 23, 0};
        int[] result = getSieve(input);
        assertArrayEquals(expected, result);

    }
}
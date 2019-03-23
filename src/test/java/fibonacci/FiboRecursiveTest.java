package fibonacci;

import static fibonacci.FiboRecursive.getFiboRecursive;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class FiboRecursiveTest {
    @Test
    public void shouldVerifyFirstFibonacciNumber() {
        int inputNumber = 1;
        long expected = 0;
        long given = getFiboRecursive(inputNumber);
        assertEquals(expected, given);
    }

    @Test
    public void shouldVerifySecondFibonacciNumber() {
        int inputNumber = 4;
        long expected = 2;
        long given = getFiboRecursive(inputNumber);
        assertEquals(expected, given);
    }

    @Test
    public void shouldVerify10thFibonacciNumber() {
        int inputNumber = 12;
        long expected = 89;
        long given = getFiboRecursive(inputNumber);
        assertEquals(expected, given);
    }

    @Test
    public void shouldVerify35thFibonacciNumber() {
        int inputNumber = 35;
        long expected = 5702887;
        long given = getFiboRecursive(inputNumber);
        assertEquals(expected, given);
    }
}




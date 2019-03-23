package multiplicationtable;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MultiplicationTableLineByLineTest {

    @Test
    public void shouldVerifyThirdLineOfMultiplicationTableTo100() {
        int input = 3;
        int[] expected = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[][] mt = MultiplicationTableLineByLine.createMultiplicationTable(10);
        assertArrayEquals(expected, mt[input - 1]);
    }

    @Test
    public void shouldVerifySixthLineOfMultiplicationTableTo225() {
        int input = 6;
        int[] expected = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 78, 84, 90};
        int[][] mt = MultiplicationTableLineByLine.createMultiplicationTable(15);
        assertArrayEquals(expected, mt[input - 1]);
    }

    @Test
    public void shouldVerifyLastLineOfMultiplicationTableTo144() {
        int input = 12;
        int[] expected = {12, 24, 36, 48, 60, 72, 84, 96, 108, 120, 132, 144};
        int[][] mt = MultiplicationTableLineByLine.createMultiplicationTable(12);
        assertArrayEquals(expected, mt[input - 1]);
    }

    @Test
    public void shouldVerifyFirstLineOfMultiplicationTableTo4() {
        int input = 1;
        int[] expected = {1, 2};
        int[][] mt = MultiplicationTableLineByLine.createMultiplicationTable(2);
        assertArrayEquals(expected, mt[input - 1]);
    }
}

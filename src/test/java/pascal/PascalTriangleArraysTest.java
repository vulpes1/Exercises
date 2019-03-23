package pascal;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static pascal.PascalTriangleArrays.binominalCoefficient;
import static pascal.PascalTriangleArrays.createPascalTriangle;

import org.junit.Test;

public class PascalTriangleArraysTest {

    @Test
    public void shouldVerifyFifthRowOfPascalTriangle() {
        int rows = 4;
        int[] expected = new int[]{1, 3, 3, 1};
        assertArrayEquals(expected, createPascalTriangle(rows)[rows - 1]);
    }

    @Test
    public void shouldVerifyNinthRowOfPascalTriangle() {
        int rows = 9;
        int[] expected = new int[]{1, 8, 28, 56, 70, 56, 28, 8, 1};
        assertArrayEquals(expected, createPascalTriangle(rows)[rows - 1]);
    }

    @Test
    public void shouldVerifyFifthElementOfSeventhRowOfPascalTriangle() {
        int rows = 7;
        int element = 5;
        int expected = 15;
        assertThat(createPascalTriangle(rows)[rows - 1][element - 1], is(equalTo(expected)));
    }

    @Test
    public void shouldVerify12ElementOfFifteenthRowOfPascalTriangle() {
        int rows = 15;
        int element = 12;
        int expected = 364;
        assertThat(createPascalTriangle(rows)[rows - 1][element - 1], is(equalTo(expected)));
    }

    @Test
    public void shouldVerify12ElementOfFifteenthRowOfPascalTriangleAssertEquals() {
        int rows = 15;
        int element = 12;
        int expected = 364;
        assertEquals(expected, createPascalTriangle(rows)[rows - 1][element - 1]);
    }

    @Test
    public void shouldVerifyValueOfBinominalCoefficientFor9_5() {
        int n = 9;
        int k = 5;
        int expected = 126;
        assertEquals(expected, binominalCoefficient(n, k));
    }

    @Test
    public void shouldVerifyValueOfBinominalCoefficientFor12_7() {
        int n = 12;
        int k = 7;
        int expected = 792;
        assertThat(binominalCoefficient(n, k), is(equalTo(expected)));
    }
}


package multiplicationtable;

import static multiplicationtable.MultiplicationTableLineByLine.createMultiplicationTable;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MultiplicationTableLineByLineTest1 {

    @Test
    public void shouldVerifyCreationOfMultiplicationTableBy4() {

        int input = 4;
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };

        int[][] result = createMultiplicationTable(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldVerifyCreationOfMultiplicationTableBy7() {

        int input = 7;
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7},
                {2, 4, 6, 8, 10, 12, 14},
                {3, 6, 9, 12, 15, 18, 21},
                {4, 8, 12, 16, 20, 24, 28},
                {5, 10, 15, 20, 25, 30, 35},
                {6, 12, 18, 24, 30, 36, 42},
                {7, 14, 21, 28, 35, 42, 49}
                };

                int[][] result = createMultiplicationTable(input);
                assertArrayEquals(expected, result);
            }
        }
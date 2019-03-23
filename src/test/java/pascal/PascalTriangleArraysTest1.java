package pascal;

import static org.junit.Assert.assertArrayEquals;
import static pascal.PascalTriangleArrays.createPascalTriangle;

import org.junit.Test;

public class PascalTriangleArraysTest1 {

    @Test
    public void shouldVerifyPascalTriangleFor6() {
        int input = 6;
        int[][] expected = {
                    {1},
                   {1, 1},
                 {1, 2, 1},
                {1, 3, 3, 1},
              {1, 4, 6, 4, 1},
            {1, 5, 10, 10, 5, 1}
        };
        int[][] result = createPascalTriangle(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldVerifyPascalTriangleFor1() {
        int input = 1;
        int[][] expected = {{1}};
        int[][] result = createPascalTriangle(1);
        assertArrayEquals(expected, result);
    }
}
package hoarePatrition;

import static hoarePatrition.HoarePartition.createHoarePartitionArray;
import static org.junit.Assert.assertArrayEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class HoarePartitionTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyHoarePartitionMethod(int[] array, int pivotIndex, int[] expected) {
        int[] result = createHoarePartitionArray(array, pivotIndex);
        assertArrayEquals(expected, result);
    }

    public Object[] dataForTesting(){
        return new Object[]{
                new Object[]{new int[]{ 1, 7, 9, 4, 3, 2, 8, 5}, 3, new int[]{1, 2, 3, 4, 9, 7, 8, 5} },
                new Object[]{new int[]{-1, 13, 7, 8, 9, 4, 12, 2, 7, 3, 2, 10, 5}, 3, new int[]{7, 5, 7, -1, 2, 4, 3, 2, 8, 12, 9, 10, 13} },
                new Object[]{new int[]{1,2}, 0, new int[]{1,2} },
                new Object[]{new int[]{1,1,1,0}, 3, new int[]{0,1,1,1} },
                new Object[]{new int[]{15,1,25,77,42,53,13,12,11,2,8,5,4,17,3,2,1}, 8, new int[]{2, 1, 1, 2, 3, 4, 5, 8, 11, 15, 12, 13, 53, 17, 42, 77, 25} }
        };
    }
}
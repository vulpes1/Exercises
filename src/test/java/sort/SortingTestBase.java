package sort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

public abstract class SortingTestBase {

    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSortSimpleArray() {

        // given
        int numberOfElements = 1000; //  enter a number of elements into array which you want to test
        Random random = new Random();
        int[] input = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            input[i] = random.nextInt(numberOfElements);
        }

        int given[] = input.clone();
        Arrays.sort(input);
        int[] expected = input;

        // when
        int[] result = getSortingMethod().sort(given);

        // then
        assertArrayEquals(expected, result);
    }
}

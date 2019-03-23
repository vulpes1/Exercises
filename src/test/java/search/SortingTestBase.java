package search;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import org.junit.Test;

public abstract class SortingTestBase {
    public abstract FindIndex getSortingMethod();

    public int findFirstOccurrenceOfElementInArray(int[] array, int elementToFind) {
        return IntStream.range(0, array.length)
                .filter(i -> array[i] == elementToFind)
                .findFirst()
                .orElse(-1);
    }

    @Test
    public void shouldVerifyFindIndexOfGivenElement() {

        // given
        int numberOfElementsInArray = 10000000;
        Random random = new Random();
        int[] array = new int[numberOfElementsInArray];

        for (int i = 0; i < numberOfElementsInArray; i++) {
            array[i] = random.nextInt(numberOfElementsInArray);
        }
        Arrays.sort(array);
        int element = random.nextInt(numberOfElementsInArray);
        int expected = findFirstOccurrenceOfElementInArray(array, element);

        // when
        long start = System.nanoTime();
        int result = getSortingMethod().findIndexOfElement(array, element);
        System.out.println(System.nanoTime() - start);

        // then
        assertEquals(expected, result);
    }
}

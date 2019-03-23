package search.searchParametrized;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import search.FindIndex;

@RunWith(JUnitParamsRunner.class)
public abstract class SortingTestBaseParam {

    public abstract FindIndex getSortingMethod();

    public int findFirstOccurrenceOfElementInArray(int[] array, int elementToFind) {
        return IntStream.range(0, array.length)
                .filter(i -> array[i] == elementToFind)
                .findFirst()
                .orElse(-1);
    }

    public int[] createArrayToTest(int size) {
        Random random = new Random();
        int[] arrayToTest = new int[size];

        for (int i = 0; i < size; i++) {
            arrayToTest[i] = random.nextInt(size);
        }
        Arrays.sort(arrayToTest);
        System.out.println(Arrays.toString(arrayToTest));
        return arrayToTest;
    }

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyFindIndexOfElement(int[] array, int elementToFind) {
        System.out.println();

        // given
        int expected = findFirstOccurrenceOfElementInArray(array, elementToFind);
        System.out.println("expected " + expected);

        //when
        int result = getSortingMethod().findIndexOfElement(array, elementToFind);
        System.out.println("result " + result);

        // then
        assertThat(result, is(equalTo(expected)));
    }

    public Object[] dataForTesting() {
        int[] array1 = createArrayToTest(10);
        int[] array2 = createArrayToTest(25);
        int[] array3 = createArrayToTest(50);

        return new Object[]{
                new Object[]{array1, array1[0]},
                new Object[]{array2, array2[24]},
                new Object[]{array3, array2[16]},
                new Object[]{createArrayToTest(20), 10},
                new Object[]{new int[]{0, 0, 0, 0, 1}, 1},
                new Object[]{new int[]{1, 1, 1, 1, 1}, 2},
                new Object[]{new int[]{1, 1, 1, 1, 1}, 1},
                new Object[]{new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5}, -1}
        };
    }
}

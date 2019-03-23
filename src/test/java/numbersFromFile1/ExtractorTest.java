package numbersFromFile1;

import static numbersFromFile1.Extractor.extractLines;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ExtractorTest {

    @Test
    @Parameters(method = "dataForTesting")
    public void shouldVerifyExtractionOfProperLines(List<String> inputList, List<String> expectedList) {
        List<String> result = extractLines(inputList);

        assertThat(result, is(equalTo(expectedList)));
    }

    public Object[] dataForTesting() {
        List<String> list1 = new ArrayList<>();
        list1.add("1 2 3");
        list1.add("3 4 5");
        list1.add("3 5 6");
        List<String> result1 = new ArrayList<>();
        result1.add("1 2 3");
        result1.add("3 4 5");
        result1.add("3 5 6");

        List<String> list2 = new ArrayList<>();
        list2.add("1 w e");
        list2.add(" % 3 4 5");
        list2.add("3 5 6");
        List<String> result2 = new ArrayList<>();
        result2.add("3 5 6");

        List<String> list3 = new ArrayList<>();
        list3.add("3 4 5 6");
        list3.add("1 1 1");
        list3.add("2 4 6");
        list3.add("@");
        List<String> result3 = new ArrayList<>();
        result3.add("3 4 5 6");
        result3.add("1 1 1");
        result3.add("2 4 6");

        List<String> list4 = new ArrayList<>();
        list4.add("1 1 222");
        list4.add("0 0 0");
        list4.add("1 2 4 6 12");
        List<String> result4 = new ArrayList<>();
        result4.add("1 1 222");
        result4.add("0 0 0");
        result4.add("1 2 4 6 12");

        return new Object[]{
                new Object[]{list1, result1},
                new Object[]{list2, result2},
                new Object[]{list3, result3},
                new Object[]{list4, result4}
        };
    }
}
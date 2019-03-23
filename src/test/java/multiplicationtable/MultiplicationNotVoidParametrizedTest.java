package multiplicationtable;

import static org.junit.Assert.assertArrayEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MultiplicationNotVoidParametrizedTest {

  @Test
  @Parameters(method = "myParametersStringArray")
  public void testedLine(int lineNumber, int size, String[] expected) {
    String[] result = MultiplicationNotVoid.multiplicationTable(size)[lineNumber - 1];
    assertArrayEquals(expected, result);
  }

  private Object myParametersStringArray() {
    return new Object[]{
        new Object[]{3, 10, new String[]{"3", "6", "9", "12", "15", "18", "21", "24", "27", "30"}},
        new Object[]{3, 5, new String[]{"3", "6", "9", "12", "15"}},
        new Object[]{1, 2, new String[]{"1", "2"}}
    };
  }
}
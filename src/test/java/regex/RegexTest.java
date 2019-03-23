package regex;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class RegexTest {

  @Ignore
  @Test
  public void shouldVerifyCorrectnessOfRegexp() {
    Regex regex = new Regex();
    for (int i = 0; i < 256; i++) {
      for (int j = 0; j < 256; j++) {
        for (int k = 0; k < 256; k++) {
          for (int l = 0; l < 256; l++) {
            String numberToTest = i + "." + j + "." + k + "." + l;
            boolean result = regex.isIpAddress(numberToTest);
            assertThat(result, is(equalTo(true)));
          }
        }
      }
    }
  }

  @Rule
  public ErrorCollector firstGroupCollector = new ErrorCollector();

  @Test

  public void shouldVerifyCorrectnessOfFirstGroupOfRegexp() {
    Regex regex = new Regex();
    for (int i = 0; i < 256; i++) {
      String numberToTest1 = i + ".123.123.123";
      boolean result1 = regex.isIpAddress(numberToTest1);
      firstGroupCollector.checkThat("Error occured in " + i + " pass of the loop", result1, equalTo(true));
    }
  }

  @Rule
  public ErrorCollector secondGroupCollector = new ErrorCollector();

  @Test
  public void shouldVerifyCorrectnessOfSecondGroupOfRegexp() {
    Regex regex = new Regex();
    for (int i = 0; i < 256; i++) {
      String numberToTest2 = "123." + i + ".123.123";
      boolean result2 = regex.isIpAddress(numberToTest2);
      firstGroupCollector.checkThat("Error occured in " + i + " pass of the loop", result2, equalTo(true));
    }
  }

  @Rule
  public ErrorCollector thirdGroupCollector = new ErrorCollector();

  @Test
  public void shouldVerifyCorrectnessOfThirdGroupOfRegexp() {
    Regex regex = new Regex();
    for (int i = 0; i < 256; i++) {
      String numberToTest3 = "123.123." + i + ".123";
      boolean result3 = regex.isIpAddress(numberToTest3);
      firstGroupCollector.checkThat("Error occured in " + i + " pass of the loop", result3, equalTo(true));
    }
  }

  @Rule
  public ErrorCollector fourthGroupCollector = new ErrorCollector();

  //    It does not pass
  @Test
  public void shouldVerifyCorrectnessOfFourthGroupOfRegexp() {
    Regex regex = new Regex();
    for (int i = -2; i < 257; i++) {
      String numberToTest4 = "123.123.123." + i;
      boolean result4 = regex.isIpAddress(numberToTest4);
      firstGroupCollector.checkThat("Error occured in " + i + " pass of the loop", result4, equalTo(true));
    }
  }
}
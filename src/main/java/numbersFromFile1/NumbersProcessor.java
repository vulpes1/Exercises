package numbersFromFile1;

import static numbersFromFile1.Counter.countTotal;
import static numbersFromFile1.NumbersStringGenerator.createAdditionString;

public class NumbersProcessor {

    public String processLine(String line) {
        return  createAdditionString(line) + countTotal(line);
    }
}

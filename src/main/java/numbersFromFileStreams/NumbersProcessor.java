package numbersFromFileStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersProcessor {

    public String processLine(String line) {
        List<Integer> intList = Arrays
                .asList(line.trim().split("\\s+"))
                .stream().map(p -> Integer.parseInt(p))
//                .stream().map(Integer::parseInt)
                .collect(Collectors.toList());

        String total = intList
                .stream()
                .reduce(0, (a, b) -> a + b)
                .toString();

        String sumAsString = Arrays
                .stream(line.trim().split("\\s+"))
                .reduce("", (n1, n2) -> n1 + " + " + n2)
                .substring(3) + " = ";

        return sumAsString + total;
    }
}
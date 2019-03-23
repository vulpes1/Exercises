package numbersFromFile1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor {

    public static List<String> extractLines(List<String> fileToWork) {
        List<String> listOfDigits = new ArrayList<>();

        Iterator<String> iterator = fileToWork.iterator();
        String regex = "[\\d\\s]+";
        Pattern pattern = Pattern.compile(regex);
        while (iterator.hasNext()) {
            String line = iterator.next();
            Matcher matcher = pattern.matcher(line);

            if (!matcher.matches()) {
                iterator.remove();
            }else {
                listOfDigits.add(line);
            }
        }
        return listOfDigits;
    }
}

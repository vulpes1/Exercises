package numbersFromFile1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testExtractor {

    public static List<String> extractLines(List<String> fileToWork) {
        List<String> listOfDigits = new ArrayList<>();

        Iterator<String> iterator = fileToWork.iterator();
        String regex = "[\\s\\d]+";
//        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        while (iterator.hasNext()) {
            String line = iterator.next();
            Matcher matcher = pattern.matcher(line);

//            if (matcher.find()) {
            if (!matcher.matches()) {
                iterator.remove();
            } else {
                listOfDigits.add(line);
            }
        }
        return listOfDigits;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String s1 = "23 1 4 5";
        String s2 = "4 3 4 a 4 a";
        String s3 = "4 5 3 2 23";
        String s4 = "asd r 332";

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        List<String> list1 = extractLines(list);
        System.out.println(list1);
    }
}
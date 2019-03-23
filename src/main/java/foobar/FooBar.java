package foobar;

import java.util.ArrayList;
import java.util.List;

public class FooBar {

    public static List<String> barOrFooBar(int maxNumber) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= maxNumber; i++) {
            String pattern = "%-2d%-9s";
            String s;
            if (i % 15 == 0) {
                s = "FooBar";
            } else if (i % 5 == 0) {
                s = "Bar";
            } else if (i % 3 == 0) {
                s = "Foo";
            } else {
                s = "";
            }
            s = String.format(pattern, i, s);
            result.add(s);
        }
        return result;
    }

    public static void printBarFooBar(int maxNumber) {
        List<String> list = barOrFooBar(maxNumber);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        printBarFooBar(30);
    }
}



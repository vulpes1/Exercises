package foobar;

import java.util.Arrays;

public class FooBarBestVersion {

    private static String createElement(int number) {
        return number + "" + (number % 3 == 0 ? "Foo" : "") + (number % 5 == 0 ? "Bar" : "");
    }

    public static String[] createFooBarArray(int numberOfElements) {
        String[] fooBarArray = new String[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            fooBarArray[i] = createElement(i + 1);
        }
        return fooBarArray;
    }

    public static void printFooBarArray(int numberOfElements) {
        String[] fooBarArray = createFooBarArray(numberOfElements);
        System.out.println(Arrays.toString(fooBarArray));
    }

    public static void main(String[] args) {
        printFooBarArray(35);

    }
}
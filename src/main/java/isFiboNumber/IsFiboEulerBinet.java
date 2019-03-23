package isFiboNumber;

import static java.lang.Math.pow;

import java.util.TreeSet;

//Use this method only to 71st number of Fibonacci, for bigger numbers the results are not correct.

public class IsFiboEulerBinet {

    public static TreeSet createFiboSet() {
        long fibo = 1;
        int counter = 0;
        TreeSet set = new TreeSet();
        while (fibo < Long.MAX_VALUE) {
            double wsp = pow(5, 0.5);
            fibo = (long) ((1 / wsp) * (pow(((1 + wsp) / 2), counter) - pow(((1 - wsp) / 2), counter)));
            if (fibo >= Long.MAX_VALUE) {
                break;
            }
            set.add(fibo);
            counter++;
        }
        return set;
    }

    public static boolean isFiboNumber(long l) {
        TreeSet fiboSet = createFiboSet();
        return fiboSet.contains(l);
    }

    public static void main(String[] args) {
        boolean isFibo = isFiboNumber(144);
        System.out.println(isFibo);
    }
}

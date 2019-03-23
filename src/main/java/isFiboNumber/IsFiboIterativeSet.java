package isFiboNumber;

import java.util.Set;
import java.util.TreeSet;

public class IsFiboIterativeSet {

    public static long fibonacciNumber(int num) {

        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }

        long f1 = 1;
        long f2 = 1;
        long fibo = 1;

        for (int i = 3; i <= num; i++) {
            fibo = f2 + f1;
            f1 = f2;
            f2 = fibo;
        }
        return fibo;
    }

    public static Set<Long> createFiboSet() {
        Set<Long> set = new TreeSet<>();
        for (int i = 0; i <= 92; i++) {
            set.add(fibonacciNumber(i));
        }
        return set;
    }

    public static boolean isFiboNumber(long l) {
        Set<Long> fiboSet = createFiboSet();
        return fiboSet.contains(0L);
    }

    public static void main(String[] args) {

        boolean isFiboNumber = isFiboNumber(3416454622906706L);
        System.out.println(isFiboNumber);
        System.out.println(createFiboSet());
    }
}
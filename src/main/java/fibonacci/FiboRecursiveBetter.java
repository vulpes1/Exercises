package fibonacci;

public class FiboRecursiveBetter {

    private static long fiboRec(int n) {
        return n < 2 ? n : (fiboRec(n - 1) + fiboRec(n - 2));
    }

    private static void printFiboNumber(int n) {
        System.out.printf("%d liczba Fibonacciego = %d", n, fiboRec(n));
    }

    public static void main(String[] args) {
        printFiboNumber(1);
    }
}




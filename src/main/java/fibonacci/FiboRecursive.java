package fibonacci;

public class FiboRecursive {

    public static long getFiboRecursive(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        } else
            return getFiboRecursive(n - 1) + getFiboRecursive(n - 2);
    }

    private static void printFiboNumber(int n) {
        System.out.printf("%d liczba Fibonacciego = %d", n, getFiboRecursive(n));
    }

    public static void main(String[] args) {
        printFiboNumber(11);
    }
}

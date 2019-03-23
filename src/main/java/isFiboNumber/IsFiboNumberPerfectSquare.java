package isFiboNumber;

//Działa w ograniczonym zakresie

public class IsFiboNumberPerfectSquare {
    public static boolean isPerfectSquare(long number) {

        int s = (int) Math.sqrt(number);
        return (Math.pow(s, 2) == number);
    }

    public static boolean isFibo(long f) {
        return (isPerfectSquare(5 * f * f + 4) || isPerfectSquare(5 * f * f - 4));
    }

    public static void main(String[] args) {

        boolean fibo = isFibo(102334155);
        System.out.println(fibo);

// metoda działa tylko dla f<= value - potem poza zakresem longa
        long value =(long)Math.sqrt((Long.MAX_VALUE-4)/5);
        System.out.println(value);
    }
}
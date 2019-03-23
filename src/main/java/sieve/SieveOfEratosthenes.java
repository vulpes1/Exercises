package sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static int[] fillArray(int number) {
        int[] array = new int[number];

        if (number == 1) {
            array[0] = 0;
        }
        if (number == 2) {
            array[0] = array[1] = 0;
        }
        for (int i = 2; i < number; i++) {
            array[i] = i;
        }

        return array;
    }

    public static int[] getSieve(int number) {
        int[] array = fillArray(number);

        for (int i = 2; i < number; i++) {
            for (int j = 2 * i; j < number; j += i) {
                array[j] = 0;
            }
        }
        return array;
    }

    private static void printSieveOfEratosthenes(int number) {
        System.out.println(Arrays.toString(getSieve(number)));
    }

    public static void main(String[] args) {
        printSieveOfEratosthenes(6);
    }
}

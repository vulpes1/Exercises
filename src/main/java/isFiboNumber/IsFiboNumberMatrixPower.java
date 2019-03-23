package isFiboNumber;

import java.util.ArrayList;
import java.util.List;

public class IsFiboNumberMatrixPower {

    final static long INDEX_OF_LAST_FIBBONACI_NUMBER_MATCHING_IN_LONG = 92;

    public static long[] multiplicationMatrix2x2(long[] matrix1, long[] matrix2) {
        return new long[]{matrix1[0] * matrix2[0] + matrix1[1] * matrix2[2], matrix1[0] * matrix2[1] + matrix1[1] * matrix2[3], matrix1[2] * matrix2[0] + matrix1[3] * matrix2[2], matrix1[2] * matrix2[1] + matrix1[3] * matrix2[3]};
    }

    public static long[] powerMatrix(long[] matrix, int power) {
        long[] result = {1, 0, 0, 1};
        for (int i = 0; i < power; i++) {
            result = multiplicationMatrix2x2(result, matrix);
        }
        return result;
    }

    public static long fiboNumber(int f) {
        long[] fiboNumbers = powerMatrix(new long[]{1, 1, 1, 0}, f - 1);
        return fiboNumbers[0];
    }

    public static List createListOfFiboNumbers() {
        List list = new ArrayList();
        list.add(0L);
        for (int i = 1; i <= INDEX_OF_LAST_FIBBONACI_NUMBER_MATCHING_IN_LONG; i++) {
            list.add(fiboNumber(i));
        }
        return list;
    }

    public static boolean isFiboNumber(long f) {
        List listOfFiboNumbers = createListOfFiboNumbers();
        return listOfFiboNumbers.contains(f);
    }

    public static void main(String[] args) {

        System.out.println(isFiboNumber(Long.MAX_VALUE));
        System.out.println(createListOfFiboNumbers());
    }
}

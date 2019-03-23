package palindrome;

public class PalindromeVerticalIntArrayTwoDimentional {

    public static boolean isTheSameLengthOfArrays(int[][] array) {
        int length = array[0].length;

        for (int i = 1; i < array.length; i++) {
            if (array[i].length != length) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeVertical2DimArray(int[][] array) {
        int[][] verticalArray = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                verticalArray[i][j] = array[j][i];
            }
        }
        return new PalindromeIntArrayTwoDimensional().areArraysPalindrome(array);
    }

    public static boolean is2DimArraySymetric(int[][] array) {
        if (isTheSameLengthOfArrays(array)) {
            return isPalindromeVertical2DimArray(array);
        }
        return false;
    }
}

package palindrome;

import static palindrome.PalindromeIntArray.isPalindrome;

public class PalindromeIntArrayTwoDimensional {

    int[][] array;

    public  boolean areArraysPalindrome(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean b = isPalindrome(array[i]);
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeIntArrayTwoDimensional palindromeIntArrayTwoDimensional = new PalindromeIntArrayTwoDimensional();
        int[][] array1 = new int[][]{{1, 3, 1}, {1, 4, 5, 4, 1}, {5, 5, 5, 5}, {0}};
        boolean palindrome2DimArray = palindromeIntArrayTwoDimensional.areArraysPalindrome(array1);
        System.out.println(palindrome2DimArray);
    }
}



package palindrome;


import static palindrome.PalindromeVerticalIntArrayTwoDimentional.is2DimArraySymetric;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[][]{{11, 23, 23, 11}, {34, 45, 45, 34}, {34, 45, 45, 34}, {11, 23, 23, 11}};
        boolean dimArraySymetric = is2DimArraySymetric(array);
        System.out.println(dimArraySymetric);

        int[][] array1 = new int[][]{{0}};
        boolean dimArraySymetric1 = is2DimArraySymetric(array1);
        System.out.println(dimArraySymetric1);

    }
}

package pascal;

public class PascalTriangle {

    private static void printPascalTriangle(int rowsNumber) {
        int q = 0;
        int coefficientNewton = 1;

        while (rowsNumber > q) {
            for (int i = 2 * (rowsNumber - q); i > 0; i--) {
                System.out.print(" ");
            }

            for (int i = 0; i <= q; i++) {
                if (i == 0) {
                    coefficientNewton = 1;
                } else {
                    coefficientNewton = (coefficientNewton * (q - i + 1)) / i;
                }
                System.out.print(coefficientNewton + "   ");
            }
            System.out.println();
            q++;
        }
    }

    public static void main(String[] args) {

        printPascalTriangle(31);
    }
}
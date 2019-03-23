package pascal;

public class PascalTriangleArrays {

    public static int binominalCoefficient (int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return ((n - k + 1) * binominalCoefficient(n, k - 1)) / k;
    }

    public static int[][] createPascalTriangle(int rowsNumber) {
        int[][] trianglePascal = new int[rowsNumber][];

        for (int i = 0; i < rowsNumber; i++) {
            int[] row = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                row[j] = binominalCoefficient(i, j);
                trianglePascal[i] = row;
            }
        }
        return trianglePascal;
    }

    public static void printTriangle(int rows) {
        int[][] triangle = createPascalTriangle(rows);
        for (int[] array : triangle) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(10);
    }
}



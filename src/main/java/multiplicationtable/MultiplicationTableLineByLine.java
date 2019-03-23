package multiplicationtable;

public class MultiplicationTableLineByLine {

    public static int[][] createMultiplicationTable(int n) {
        int[][] array = new int[n][n];

        for (int i = 1; i <= n; i++) {
            int[] row = new int[n];
            for (int j = 1; j <= n; j++) {
                row[j - 1] = i * j;
            }
            array[i - 1] = row;
        }
        return array;
    }

    public static void printMultiplicationTable(int n) {
        for (int[] tab : createMultiplicationTable(n)) {
            for (int i : tab) {
                System.out.printf("%-5d", i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(30);
    }
}


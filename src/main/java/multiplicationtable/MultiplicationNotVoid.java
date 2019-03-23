package multiplicationtable;

public class MultiplicationNotVoid {

    public static String[][] multiplicationTable(int tableSize) {
        String[][] array = new String[tableSize][tableSize];
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                array[i - 1][j - 1] = String.format("%d", i * j);
            }
        }
        return array;
    }

    public static void printMultiplicationTable(int i) {
        String[][] array = multiplicationTable(i);
        for (String[] s : array) {
            for (String result : s) {
                System.out.print(result);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(40);
    }
}

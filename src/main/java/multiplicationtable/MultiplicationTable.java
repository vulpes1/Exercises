package multiplicationtable;

public class MultiplicationTable {

    private static void printMultiplicationTable(int tableSize) {
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%-5d", i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(15);
    }
}

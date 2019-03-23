package christmas;

public class ChristmasTreeForTest {

    private static String createEmptyString(int rowsNumber) {
        String emptyString = " ";
        for (int i = 0; i < rowsNumber; i++) {
            emptyString += " ";
        }
        return emptyString;
    }

    public static String createRow(int numbersOfElements) {
        String treeConstructionElement = "o ";
        String row = " ";

        for (int i = 0; i < numbersOfElements; i++) {
            row += treeConstructionElement;
        }
        return row;
    }

    public static String[] createTree(int rowsNumber) {
        String[] tree = new String[rowsNumber];

        for (int i = 0; i < rowsNumber; i++) {
            tree[i] = String.format("%s%-1s", createEmptyString(rowsNumber).substring(i), createRow(i + 1));
        }
        return tree;
    }

    private static void createTrunk(int rowsNumber) {
        int trunkLength = rowsNumber / 5 + 1;
        String trunk = createEmptyString(rowsNumber) + "oo\n";

        for (int i = 0; i <= trunkLength; i++) {
            System.out.printf("%s", trunk);
        }
    }

    private static void printChristmasTree(int rowsNumber) {
        String[] tree = createTree(rowsNumber);

        for (int i = 0; i < rowsNumber; i++) {
            System.out.println(tree[i]);
        }
        createTrunk(rowsNumber);
    }

    public static void main(String[] args) {

        printChristmasTree(8);
    }
}

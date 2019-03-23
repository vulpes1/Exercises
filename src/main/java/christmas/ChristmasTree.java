package christmas;

public class ChristmasTree {

    final static String TREE_CONSTRUCTION_ELEMENT = "o ";

    private static String createEmptyString(int rowsNumber) {
        String emptySpaceConstructionElement = " ";
        for (int i = 0; i < rowsNumber; i++) {
            emptySpaceConstructionElement += " ";
        }
        return emptySpaceConstructionElement;
    }

    public static String[] createTree(int rowsNumber) {
        String[] completeTree = new String[rowsNumber + rowsNumber / 4 + 1];
        String row = " ";

        for (int i = 0; i < rowsNumber; i++) {
            row += TREE_CONSTRUCTION_ELEMENT;
            completeTree[i] = String.format("%s%-1s", createEmptyString(rowsNumber).substring(i), row);
        }

        for (int i = rowsNumber; i < (rowsNumber + rowsNumber / 4 + 1); i++) {
            completeTree[i] = createEmptyString(rowsNumber) + "oo";
        }
        return completeTree;
    }

    public static String[] printCompleteChristmasTree(int rowsNumber) {
        String[] tree = createTree(rowsNumber);

        for (int i = 0; i < rowsNumber + rowsNumber / 4 + 1; i++) {
            System.out.println(tree[i]);
        }
        return tree;
    }

    public static void main(String[] args) {

        printCompleteChristmasTree(8);
    }
}

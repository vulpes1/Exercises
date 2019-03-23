package numbersFromFile1;

public class testAddition {

    public static String createAdditionString(String line) {
        String[] row = line.trim().split("\\s");
        String addition = " ";

        for (int i = 0; i < row.length - 1; i++) {
            addition += (row[i]) + "+";
        }
        String lastElement = (row[row.length - 1]) + " = ";
        return addition + lastElement;
    }

    public static void main(String[] args) {
        String s = "1 2 4 3 5";
        String additionString = createAdditionString(s);
        System.out.println(additionString);
    }
}
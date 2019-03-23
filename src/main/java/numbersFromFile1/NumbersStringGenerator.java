package numbersFromFile1;

public class NumbersStringGenerator {

    public static String createAdditionString(String line) {
        String[] row = line.trim().split("\\s+");

        String resultString = "";
        for (int i = 0; i < row.length - 1; i++) {
            resultString += row[i] + " + ";
        }
        String lastElement = row[row.length - 1] + " = ";
        return resultString + lastElement;
    }
}

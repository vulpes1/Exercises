package numbersFromFile1;

public class Counter {

    public static String countTotal(String line) {
        String[] row = line.trim().split("\\s");
        int total = 0;

        for (int i = 0; i < row.length; i++) {
            total += Integer.parseInt(row[i]);
        }
        return String.valueOf(total);
    }
}

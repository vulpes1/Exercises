package numbersFromFile1;

import java.util.Arrays;

public class testCounter {

    public static String countTotal(String line) {
        String[] row = line.trim().split("\\s");
        System.out.println(Arrays.toString(row));
        int total = 0;

        for (int i = 0; i < row.length ; i++) {
            total += Integer.parseInt(row[i]);
        }
        System.out.println(2*total);
        return String.valueOf(total);
    }

    public static void main(String[] args) {

        String s = "1 2 4 3 5";
        String s1 = countTotal(s);
        System.out.println(s1);
        System.out.println(s1+s1);
    }
}

package numbersFromFile1;

public class testNumbersProcessor {

    public static void main(String[] args) {

        String s = "1 2 4 3 5";
        NumbersProcessor numbersProcessor = new NumbersProcessor();
        String s1 = numbersProcessor.processLine(s);
        System.out.println(s1);
    }
}

package numbersFromFileStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Processor {

    private FileProcessor fileProcessor;
    private NumbersProcessor numbersProcessor;

    private Processor(FileProcessor fileProcessor, NumbersProcessor numbersProcessor) {
        this.fileProcessor = fileProcessor;
        this.numbersProcessor = numbersProcessor;
    }

    public void process(String fileName, String resultFileName) {
        List<String> linesFromFile = fileProcessor
                .readLinesFromFile(fileName)
                .stream()
                .filter(Pattern.compile("^(\\s*\\d+\\s*)+$").asPredicate())
                .collect(Collectors.toList());

        List<String> resultLines = new ArrayList<>();

        for (String line : linesFromFile) {
            resultLines.add(numbersProcessor.processLine(line));
        }
        fileProcessor.writeLinesToFile(resultLines, resultFileName);
    }

    public static void main(String[] args) {

        NumbersProcessor numbersProcessor = new NumbersProcessor();
        FileProcessor fileProcessor = new FileProcessor();
        Processor processor = new Processor(fileProcessor, numbersProcessor);
        processor.process("inputFile.txt", "outputFile.txt");
    }
}

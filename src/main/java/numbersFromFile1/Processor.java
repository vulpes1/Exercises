package numbersFromFile1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Processor {

    private NumbersProcessor numbersProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumbersProcessor numbersProcessor, FileProcessor fileProcessor) {
        this.numbersProcessor = numbersProcessor;
        this.fileProcessor = fileProcessor;
    }

    public void process(File pathFileToRead, File pathFileToWrite) {
        List<String> linesFromFile = fileProcessor.readLinesFromFile(pathFileToRead);
        List<String> resultLines = new ArrayList<>();

        for (String line : linesFromFile) {
            resultLines.add(numbersProcessor.processLine(line));
        }
        fileProcessor.writeLinesToFile(resultLines, pathFileToWrite);
    }

    public static void main(String[] args)  {

        NumbersProcessor numbersProcessor = new NumbersProcessor();
        FileProcessor fileProcessor = new FileProcessor();
        Processor processor = new Processor(numbersProcessor, fileProcessor);
        processor.process(new File("numbers.txt"), new File("testFile.txt"));
    }
}
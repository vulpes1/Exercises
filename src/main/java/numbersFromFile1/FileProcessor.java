package numbersFromFile1;

import static numbersFromFile1.Extractor.extractLines;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List<String> readLinesFromFile(File path) {
        List<String> linesFormFile = new ArrayList<>();
        String currentLine;

        try (FileReader fileReader = new FileReader(path); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((currentLine = bufferedReader.readLine()) != null) {
                linesFormFile.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return extractLines(linesFormFile);
    }

    public void writeLinesToFile(List<String> fileToWrite, File path) {
        try (FileWriter fileWriter = new FileWriter(path); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : fileToWrite) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
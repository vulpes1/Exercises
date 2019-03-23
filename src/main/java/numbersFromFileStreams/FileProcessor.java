package numbersFromFileStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileProcessor {

    public List<String> readLinesFromFile(String path) {
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            list = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeLinesToFile(List<String> list, String path) {
        try (FileOutputStream fos = new FileOutputStream(new File(path)); OutputStreamWriter osw = new OutputStreamWriter(fos)) {
            for (String s : list) {
                osw.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
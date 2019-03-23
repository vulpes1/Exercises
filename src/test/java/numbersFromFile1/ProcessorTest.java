package numbersFromFile1;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

    @Mock
    private NumbersProcessor numbersProcessor;

    @Mock
    private FileProcessor fileProcessor;

    @InjectMocks
    private Processor processor;

    @Test
    public void shouldProcessGivenFile() {

        //given
        String line1 = "1 2 3";
        String line2 = "3 4 5";
        String line3 = "3 0 12 6";

        String processed1 = "1 + 2 + 3 = 6";
        String processed2 = "3 + 4 + 5 = 12";
        String processed3 = "3 + 0 + 12 + 6 = 21";

        when(fileProcessor.readLinesFromFile(new File("inputFile.txt"))).thenReturn(Arrays.asList(line1, line2, line3));
        when(numbersProcessor.processLine(line1)).thenReturn(processed1);
        when(numbersProcessor.processLine(line2)).thenReturn(processed2);
        when(numbersProcessor.processLine(line3)).thenReturn(processed3);

        // when
        processor.process(new File("inputFile.txt"), new File("outputFile.txt"));

        // then
        verify(fileProcessor).readLinesFromFile(new File("inputFile.txt"));
        verify(numbersProcessor).processLine(line1);
        verify(numbersProcessor).processLine(line2);
        verify(numbersProcessor).processLine(line3);
        verify(fileProcessor).writeLinesToFile(Arrays.asList(processed1, processed2, processed3), new File("outputFile.txt"));
    }
}

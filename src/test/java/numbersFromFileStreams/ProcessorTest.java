package numbersFromFileStreams;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

    @Mock
    private FileProcessor fileProcessor;

    @Mock
    private NumbersProcessor numbersProcessor;

    @InjectMocks
    private Processor processor;

    @Test
    public void shouldProcessProvidedFiles() {

        // given

        String el1 = "1 2 3";
        String el2 = "4 5 6 ";
        String el3 = "0 0 0 0 0";
        String el4 = "0101010 1010101";
//        String el4 = "-1";
        String processed1 = "1 + 2 + 3 = 6";
        String processed2 = "";
        String processed3 = "!@#$%^&*()";
        String processed4 = "-1 + -2 = -5";
//        String processed4 = "-1 = -1";

        when(fileProcessor.readLinesFromFile("fileToRead.txt")).thenReturn(Arrays.asList(el1, el2,el3, el4));
        when(numbersProcessor.processLine(el1)).thenReturn(processed1);
        when(numbersProcessor.processLine(el2)).thenReturn(processed2);
        when(numbersProcessor.processLine(el3)).thenReturn(processed3);
        when(numbersProcessor.processLine(el4)).thenReturn(processed4);

        // when

        processor.process("fileToRead.txt", "fileToWrite.txt");

        // then

        verify(fileProcessor).readLinesFromFile("fileToRead.txt");
        verify(numbersProcessor).processLine(el1);
        verify(numbersProcessor).processLine(el2);
        verify(numbersProcessor).processLine(el3);
        verify(numbersProcessor).processLine(el4);
        verify(fileProcessor).writeLinesToFile(Arrays.asList(processed1, processed2, processed3, processed4), "fileToWrite.txt");
    }
}
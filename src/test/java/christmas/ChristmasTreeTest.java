package christmas;



import static christmas.ChristmasTree.createTree;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChristmasTreeTest {

    @Test
    public void shouldVerify3rdLevelOf3_OfChristmasTree() {
        int level = 3;
        String expected = "   o o o ";
        assertEquals(expected, createTree(level)[level - 1]);
    }

    @Test
    public void shouldVerify10thLevelOf10_OfChristmasTree() {
        int level = 10;
        String expected = "   o o o o o o o o o o ";
        assertEquals(expected, createTree(level)[level - 1]);
    }

    @Test
    public void shouldVerify12thLevelOf15_OfChristmasTree() {
        int level = 15;
        String expected = "      o o o o o o o o o o o o ";
        assertEquals(expected, createTree(level)[level - 4]);
    }
}
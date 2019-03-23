package christmas;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ChristmasTreeCompleteChristmasTreeTest {

    @Test
    public void shouldVerify6RowsCompleteChristmasTree() {
        // given
        int levels = 6;
        String[] expected = {
                "        o ",
                "       o o ",
                "      o o o ",
                "     o o o o ",
                "    o o o o o ",
                "   o o o o o o ",
                "       oo",
                "       oo"
        };

        // when
        String[] result = ChristmasTree.printCompleteChristmasTree(levels);

        // then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldVerify8RowsCompleteChristmasTree() {
        // given
        int levels = 8;
        String[] expected = {
                "          o ",
                "         o o ",
                "        o o o ",
                "       o o o o ",
                "      o o o o o ",
                "     o o o o o o ",
                "    o o o o o o o ",
                "   o o o o o o o o ",
                "         oo",
                "         oo",
                "         oo"
        };

        // when
        String[] result = ChristmasTree.printCompleteChristmasTree(levels);

        // then
        assertArrayEquals(expected, result);
    }
}
package aki;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturn3() {
        int[] input = new int[]{11, 4, 14, 3, 8, 15, 20};

        int response = App.findPairs(input, 5);

        assertEquals(3, response);
    }

    @Test
    public void shouldReturn5() {
        int[] input = new int[]{11, 5, 4, 14, 3, 8, 15, 20};

        int response = App.findPairs(input, 5);

        assertEquals(5, response);
    }

    @Test
    public void shouldReturn9() {
        int[] input = new int[]{1, 5, 17, 20, 3, 4, 9, 15, 21};

        int response = App.findPairs(input, 6);

        assertEquals(9, response);
    }

    @Test
    public void shouldStillReturn9() {
        int[] input = new int[]{1, 5, 17, 20, 3, 4, 9, 15, 21, 18};

        int response = App.findPairs(input, 6);

        assertEquals(9, response);
    }

    @Test
    public void shouldStillReturn10() {
        int[] input = new int[]{1, 5, 17, 20, 3, 4, 9, 15, 21, 18, 6};

        int response = App.findPairs(input, 6);

        assertEquals(10, response);
    }

    @Test
    public void shouldReturn0() {
        int[] input = new int[]{3};

        int response = App.findPairs(input, 5);

        assertEquals(0, response);
    }

    @Test
    public void shouldReturn55_numberOfAllUniqueCombinations() {
        int[] input = new int[]{1, 5, 17, 20, 3, 4, 9, 15, 21, 18, 6};

        int response = App.findPairs(input, 1);

        assertEquals(55, response);
    }

}

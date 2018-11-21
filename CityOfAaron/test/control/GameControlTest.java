package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DIDIM
 */
public class GameControlTest {

    /**
     * Test of getRandomNumber method, of class GameControl.
     */
    //Test invalid min and invalid max
    @Test
    public void testGetRandomNumber1() {
        int result = GameControl.getRandomNumber(-1, 10);
        assertEquals(-1, result);

        result = GameControl.getRandomNumber(10, -1);
        assertEquals(-1, result);

    }

//Test high for low and same values
    @Test
    public void testGetRandomNumber2() {
        int result = GameControl.getRandomNumber(100, 10);
        assertEquals(-2, result);

        result = GameControl.getRandomNumber(5, 5);
        assertEquals(-2, result);

    }
//    test max limit

    @Test
    public void testGetRandomNumber3() {
        int result = GameControl.getRandomNumber(0, Integer.MAX_VALUE);
        assertEquals(-3, result);

    }

    // test all valid using multi-dimensional array and for loop
    @Test
    public void testGetRandomNumberValid() {
        int[][] testRanges = new int[][]{
            {1, 10},
            {15, 100},
            {5, 6},
            {0, Integer.MAX_VALUE - 1}
        };

        for (int i = 0; i < testRanges.length; i++) {
            int low = testRanges[i][0];
            int high = testRanges[i][1];

            int random = GameControl.getRandomNumber(low, high);
            System.out.printf("%d <= %d <= %d\n", low, random, high);

            assertTrue(
                String.format("%d should be between %d and %d", random, low, high),
                random >= low && random <= high);

        }
    }
}

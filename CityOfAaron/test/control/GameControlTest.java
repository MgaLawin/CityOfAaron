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
    @Test
    public void testGetRandomNumber() {
        int result = GameControl.getRandomNumber(-1, 10);
        assertEquals(-1, result);
       
    }
    
     @Test
    public void testGetRandomNumber1() {
        int result = GameControl.getRandomNumber(10, -1);
        assertEquals(-1, result);
       
    }
    
    //this test is failing, not sure why. 
  @Test
    public void testGetRandomNumber3() {
        int result = GameControl.getRandomNumber(5, 5);
        assertEquals(-2, result);
       
    }
    
}

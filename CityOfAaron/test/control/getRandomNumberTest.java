
import control.GameControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DIDIM
 */
public class getRandomNumberTest {
    
    @Test
    public void test1() {
        int random = GameControl.getRandomNumber(-1, 10);
        assertEquals (-1, random);
        
        random = GameControl.getRandomNumber(10,-1);
        assertEquals(-1, random);
    }
    
    
}

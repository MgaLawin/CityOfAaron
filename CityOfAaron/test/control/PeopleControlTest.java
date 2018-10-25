
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chelseawaite
 */
public class PeopleControlTest {
   
   public PeopleControlTest() {
   }

   /**
    * Test of calculateMortality method, of class PeopleControl.
    */
   @Test
   public void testCalculateMortality() {
      System.out.println("calculateMortality");
      int bushelsForFood = 0;
      int currentPopulation = 0;
      int expResult = 0;
      int result = PeopleControl.calculateMortality(bushelsForFood, currentPopulation);
      assertEquals(expResult, result);
   }
   
}

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
    //test valid
    @Test
    public void testCalculateMortality() {
        System.out.println("calculateMortality");
        int bushelsForFood = 1500;
        int currentPopulation = 100;
        int expResult = 25;
        int result = PeopleControl.calculateMortality(bushelsForFood, currentPopulation);
        assertEquals(expResult, result);
    }

    //test valid
    @Test
    public void testCalculateMortality2() {
        System.out.println("calculateMortality");
        int bushelsForFood = 20000;
        int currentPopulation = 1200;
        int expResult = 200;
        int result = PeopleControl.calculateMortality(bushelsForFood, currentPopulation);
        assertEquals(expResult, result);
    }

    //test valid
    @Test
    public void testCalculateMortality3() {
        System.out.println("calculateMortality");
        int bushelsForFood = 300000;
        int currentPopulation = 15000;
        int expResult = 0;
        int result = PeopleControl.calculateMortality(bushelsForFood, currentPopulation);
        assertEquals(expResult, result);
    }

    //test invalid negative bushelsForFood
    @Test
    public void testCalculateMortality4() {
        System.out.println("calculateMortality");
        int bushelsForFood = -200;
        int currentPopulation = 1000;
        int expResult = -1;
        int result = PeopleControl.calculateMortality(bushelsForFood, currentPopulation);
        assertEquals(expResult, result);
    }

    //test invalid currentPopulation
    @Test
    public void testCalculateMortality5() {
        System.out.println("calculateMortality");
        int bushelsForFood = 5000;
        int currentPopulation = -60;
        int expResult = -1;
        int result = PeopleControl.calculateMortality(bushelsForFood, currentPopulation);
        assertEquals(expResult, result);
    }

}

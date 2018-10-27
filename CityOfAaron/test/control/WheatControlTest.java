package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DIDIM
 */
public class WheatControlTest {

    public WheatControlTest() {
    }

    /**
     * Test of calculateLossToRats method, of class WheatControl.
     */
    @Test
    //invalid testing wheat in storag is 0  return -1
    public void testCalculateLossToRats() {
        System.out.println("calculateLossToRats");
        double tithingPercent = .10;
        int wheatInStorage = 0;
        int expResult = -1;
        int result = WheatControl.calculateLossToRats(tithingPercent, wheatInStorage);
        assertEquals(-1, result);

    }

    @Test
    // invalid percentage of tithing
    public void testCalculateLossToRats1() {
        int result = WheatControl.calculateLossToRats(-.1, 10);
        assertEquals(-2, result);

        result = WheatControl.calculateLossToRats(1, 10);
        assertEquals(-2, result);

    }

    @Test
    // insert fake random to test above 30
    public void testCalculateLossToRats2() {
        //create fake number
        FakeRandom fakeRandom = new FakeRandom();
        fakeRandom.add(62);

        int result = GameControl.getRandomNumber(1, 100);
        assertEquals(0, fakeRandom.nextInt(10));

    }

    @Test
    // test for number below 30
    public void testCalculateLossToRats3() {
        FakeRandom fakeRandom = new FakeRandom();
        fakeRandom.add(22);

        int result = GameControl.getRandomNumber(1, 100);
        assertEquals(0, fakeRandom.nextInt(10));

    }

    /**
     * Test of calculateHarvest method, of class WheatControl.
     */
    //valid test for tithingPercent > 12 Random num=5
    @Test
    public void testCalculateHarvest1() {
        //create fake number
        FakeRandom fakeRandom = new FakeRandom();
        fakeRandom.add(5);

        System.out.println("calculateHarvest");
        int tithingPercent = 13;
        int acresPlanted = 10;
        int expResult = 50;
        int result = WheatControl.calculateHarvest(tithingPercent, acresPlanted);
        assertEquals(expResult, result);
    }

    //valid test for tithingPercent > 8 && <= 12 Random num=4
    @Test
    public void testCalculateHarvest2() {
        int result = WheatControl.calculateHarvest(10, 10);
        assertEquals(40, result);
    }

    //valid test for tithingPercent > 0 && <= 8 Random num=3
    @Test
    public void testCalculateHarvest3() {
        int result = WheatControl.calculateHarvest(7, 10);
        assertEquals(30, result);
    }

    //invalid test for acresPlanted < 0 return -1
    @Test
    public void testCalculateHarvest4() {
        int result = WheatControl.calculateHarvest(10, -10);
        assertEquals(-1, result);
    }

    //invalid test for tithingPercent < 0 return -2
    @Test
    public void testCalculateHarvest5() {
        int result = WheatControl.calculateHarvest(-10, 10);
        assertEquals(-2, result);
    }

    //invalid test for tithingPercent > 100 return -2
    @Test
    public void testCalculateHarvest6() {
        int result = WheatControl.calculateHarvest(115, 10);
        assertEquals(-2, result);
    }

    //boundary test for tithingPercent = 0 Random num = 1
    @Test
    public void testCalculateHarvest7() {
        int result = WheatControl.calculateHarvest(0, 10);
        assertEquals(10, result);
    }

    //boundary test for acresPlanted = 0 Random num = 4
    @Test
    public void testCalculateHarvest8() {
        int result = WheatControl.calculateHarvest(10, 0);
        assertEquals(0, result);
    }

}

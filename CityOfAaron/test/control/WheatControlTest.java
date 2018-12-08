package control;

import Exceptions.GameControlException;
import Exceptions.WheatControlException;
import org.junit.Test;
import static org.junit.Assert.*;
import view.ViewBase;

/**
 *
 * @author DIDIM
 */
public abstract class WheatControlTest extends ViewBase {

    public WheatControlTest() {
    }

    /**
     * Test of calculateLossToRats method, of class WheatControl1. Deon's
     * Testing
     */
    @Test
    //boundary testing wheat in storage is 0  return 0

    public void testCalculateLossToRats() throws WheatControlException, GameControlException {
        this.console.println("calculateLossToRats");
        int tithingPercent = 8;
        int wheatInStorage = 0;
        int expResult = 0;
        int result = WheatControl.calculateLossToRats(tithingPercent, wheatInStorage);
        assertEquals(expResult, result);

    }

    @Test
    // invalid testing negative wheatInStorage
    public void testCalculateLossToRats0() throws WheatControlException, GameControlException {
        int result = WheatControl.calculateLossToRats(10, -1);
        assertEquals(-1, result);
    }

    @Test
    // invalid percentage of negative tithing
    public void testCalculateLossToRats1() throws WheatControlException, GameControlException {
        int result = WheatControl.calculateLossToRats(-.0001, 1);
        assertEquals(-2, result);
    }

    @Test
    // invalid percentage of tithing over 100%
    public void testCalculateLossToRats2() throws WheatControlException, GameControlException {
        int result = WheatControl.calculateLossToRats(101, 1100);
        assertEquals(-2, result);

    }

    @Test
    // invalid percentage of tithing over 100%
    public void testCalculateLossToRats3() throws WheatControlException, GameControlException {
        int result = WheatControl.calculateLossToRats(101, 1100);
        assertEquals(-2, result);

    }

    @Test
    // insert fake random to test above 30
    public void testCalculateLossToRats4() throws GameControlException {
        //create fake number
        FakeRandom fakeRandom = new FakeRandom();
        fakeRandom.add(62);

        int result = GameControl.getRandomNumber(1, 100);
        assertEquals(62, fakeRandom.nextInt(10));

    }

    @Test
    // test for number below 30 and tithing above 12
    public void testCalculateLossToRats5() throws GameControlException {
        FakeRandom fakeRandom = new FakeRandom();
        fakeRandom.add(22);
        fakeRandom.add(4);

        int result = GameControl.getRandomNumber(1, 100);
        assertEquals(22, fakeRandom.nextInt(10));

        // tithing > 12%
        result = GameControl.getRandomNumber(3, 5);
        assertEquals(4, fakeRandom.nextInt(10));

    }

    @Test
    // test for number below 30 and tithing between 8-12
    public void testCalculateLossToRats6() throws GameControlException {
        FakeRandom fakeRandom = new FakeRandom();
        fakeRandom.add(22);
        fakeRandom.add(6);

        int result = GameControl.getRandomNumber(1, 100);
        assertEquals(22, fakeRandom.nextInt(10));

        // tithing between 8-12
        result = GameControl.getRandomNumber(3, 7);
        assertEquals(6, fakeRandom.nextInt(10));

    }

    @Test
    // test for number below 30 and tithing between 8 and below
    public void testCalculateLossToRats7() throws GameControlException {
        FakeRandom fakeRandom = new FakeRandom();
        fakeRandom.add(22);
        fakeRandom.add(7);

        int result = GameControl.getRandomNumber(1, 100);
        assertEquals(22, fakeRandom.nextInt(10));

        // tithing below 8
        result = GameControl.getRandomNumber(6, 8);
        assertEquals(7, fakeRandom.nextInt(10));

    }

    @Test
    // boundary for number below 30 and tithing equal to 0

    public void testCalculateLossToRats8() throws GameControlException {
        FakeRandom fakeRandom = new FakeRandom();
        fakeRandom.add(22);
        fakeRandom.add(8);

        int result = GameControl.getRandomNumber(1, 100);
        assertEquals(22, fakeRandom.nextInt(10));

        // tithing 0
        result = GameControl.getRandomNumber(6, 8);
        assertEquals(8, fakeRandom.nextInt(10));

    }

    /**
     * Test of calculateHarvest method, of class WheatControl1. Jeremy's Testing
     */
    //valid test for tithingPercent > 12 Random num=5
    @Test
    public void testCalculateHarvest1() throws WheatControlException, GameControlException {
        //create fake number
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(5);

        this.console.println("calculateHarvest");
        int tithingPercent = 13;
        int acresPlanted = 10;
        int expResult = 70;
        int result = WheatControl.calculateHarvest(tithingPercent, acresPlanted);
        assertEquals(expResult, result);
    }

    //valid test for tithingPercent > 8 && <= 12 Random num=4
    @Test
    public void testCalculateHarvest2() throws WheatControlException, GameControlException {
        //create fake number
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(4);

        int result = WheatControl.calculateHarvest(10, 10);
        assertEquals(60, result);
    }

    //valid test for tithingPercent > 0 && <= 8 Random num=3
    @Test
    public void testCalculateHarvest3() throws WheatControlException, GameControlException {
        //create fake number
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(3);

        int result = WheatControl.calculateHarvest(7, 10);
        assertEquals(40, result);
    }

    //invalid test for acresPlanted < 0 return -1
    @Test
    public void testCalculateHarvest4() throws WheatControlException, GameControlException {
        int result = WheatControl.calculateHarvest(10, -10);
        assertEquals(-1, result);
    }

    //invalid test for tithingPercent < 0 return -2
    @Test
    public void testCalculateHarvest5() throws WheatControlException, GameControlException {
        int result = WheatControl.calculateHarvest(-10, 10);
        assertEquals(-2, result);
    }

    //invalid test for tithingPercent > 100 return -2
    @Test
    public void testCalculateHarvest6() throws WheatControlException, GameControlException {
        int result = WheatControl.calculateHarvest(115, 10);
        assertEquals(-2, result);
    }

    //boundary test for tithingPercent = 0 Random num = 1
    @Test
    public void testCalculateHarvest7() throws WheatControlException, GameControlException {
        //create fake number
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(1);

        int result = WheatControl.calculateHarvest(0, 10);
        assertEquals(20, result);
    }

    //boundary test for acresPlanted = 0 Random num = 4
    @Test
    public void testCalculateHarvest8() throws WheatControlException, GameControlException {
        //create fake number
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(4);

        int result = WheatControl.calculateHarvest(10, 0);
        assertEquals(0, result);
    }

}

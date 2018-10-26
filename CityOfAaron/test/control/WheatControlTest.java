/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public void testCalculateLossToRats2(){
    //create fake number
    FakeRandom fakeRandom = new FakeRandom();
    fakeRandom.add(62);
    
    int result =GameControl.getRandomNumber(1,100);
    assertEquals(0, fakeRandom.nextInt(10));
    
}
    @Test
   // test for number below 30   
    public void testCalculateLossToRats3() {
    FakeRandom fakeRandom = new FakeRandom();
    fakeRandom.add(22);
    
    int result =GameControl.getRandomNumber(1,100);
    assertEquals(0, fakeRandom.nextInt(10));
    
}

}

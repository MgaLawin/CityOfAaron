package control;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author DIDIM
 */
public class TestFakeRandom {
/**
 * demonstrates the basic use of the FakeRandom Class
 */
    

@Test
public void demonstrateHowToUseFakeRandom() {

//create an instance of the FakeRadomClass. use anywhere a real Random is needed because Fake Random extends Random.
FakeRandom fakeRandom= new FakeRandom();

//Stuff the fake random with a few test values
fakeRandom.add(1);
fakeRandom.add(5);

// because it is fake you can violate the normal semanitcs of random
fakeRandom.add(-23);

//test the values
assertEquals(1, fakeRandom.nextInt(10));
assertEquals(5, fakeRandom.nextInt(10));

//test the empty behaviors
assertEquals(-1, fakeRandom.nextInt(10));


}
}




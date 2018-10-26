package control;

import java.util.Random;
import java.util.ArrayList;


/**
 *
 * @author DIDIM
* Trying out the fake random for testing.
*/
public class FakeRandom {
    
    //Random in serializable 
    private static final long serialVersionUID = 1L;

// store the predetermined integer value that have been added to the object
private ArrayList<Integer> integersToReturn = new ArrayList<>();

// add the specified integer value to the list of values that will be returned by the nextInv() method
public void add(int number) {
  integersToReturn.add(number);
}
/**
 * returns the next predetermined value from the list or -1 if these are no more predetermined values to be returned
 */
@Override
public int nextInt( int bound){
    //make sure we have something to return
    if (integersToReturn.size() ==0){
        return-1;        
    }
    int returnInteger = integersToReturn.get(0);
    
    //remove the value so that we do not reuse it.
    
   integersToReturn.remove(0);
   
   return returnInteger;
    
}
    
    
}

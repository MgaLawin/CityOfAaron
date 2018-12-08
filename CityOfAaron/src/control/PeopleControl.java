package control;

import Exceptions.GameControlException;
import Exceptions.PeopleControlException;
import view.ErrorView;

/**
 *
 * @author chelseawaite
 */
public class PeopleControl {

    public static int calculateMortality(int bushelsForFood, int currentPopulation) throws PeopleControlException {

        // if bushelsForFood < 0 then return -1
        if (bushelsForFood < 0) {
            throw new PeopleControlException("\nYou cannot provide negative food. Please enter a positive number.\n");
        }
        //if currentPopulation < 0 then return -1
        if (currentPopulation < 0) {
            throw new PeopleControlException("\nYou cannot have a negative amount of population.\n");
        }
        //numberOfPeopleFed = bushelsForFood / 20
        int numberOfPeopleFed = bushelsForFood / 20;
        //if numberOfPeopleFed > currentPopulation then return 0 // everyone got fed
        if (numberOfPeopleFed > currentPopulation) {
            return 0;
        }
        //otherwise return currentPopulation - numberOfPeopleFed
        int calculateMortality = currentPopulation - numberOfPeopleFed;

        return calculateMortality;

    }

    static int calculateNewMoveIns(int currentPopulation) throws PeopleControlException {
        if (currentPopulation < 0) {
            throw new PeopleControlException("\nYou cannot have a negative amount of population.\n");
        }

        int low = 1;
        int high = 5;

        double percentGrowth = 0;
        try {
            percentGrowth = GameControl.getRandomNumber(low, high) * 0.01; //Returns the number as a fraction
        } catch (GameControlException gce) {
            ErrorView.display("PeopleControl", gce.getMessage());
        }
        double numberOfNewPeople = currentPopulation * percentGrowth;
        double roundedValue = Math.round(numberOfNewPeople);
        int intValue = (int) roundedValue;

        return intValue;
    }
}

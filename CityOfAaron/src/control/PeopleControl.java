/*
 *
Pseudocode:
+ PeopleControl.calculateMortality(int bushelsForFood, int currentPopulation): int

// Calculate the number of people who are not fed the amount required to
// sustain life (20 bushels per person). They die. It is very sad. If 50% die, game over.

if bushelsForFood < 0 then return -1
if currentPopulation < 0 then return -1

numberOfPeopleFed = bushelsForFood / 20

if numberOfPeopleFed > currentPopulation then return 0 // everyone got fed
otherwise return currentPopulation - numberOfPeopleFed
 */
package control;

import Exceptions.PeopleControlException;

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
}

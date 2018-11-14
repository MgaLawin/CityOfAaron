package control;

/**
 *
 * @author DIDIM & Jeremy
 */
public class WheatControl {

    public static int calculateLossToRats(double tithingPercent, int wheatInStorage) {
        int high;
        int low;
        double percentLost;
        //calculate the amount of wheat in storage lost to rats, based on the percentage of tithing paid.

        //if wheatinStorage <0 then return -1
        if (wheatInStorage < 0) {
            return -1;
        }

        //if tithingPercent < 0 or tithingPercent > 100 return -2
        if (tithingPercent < 0 || tithingPercent > 100) {
            return -2;
        }

        //chanceOfRats= GameControl.getRandomNumber(1,100)
        int chanceOfRats = GameControl.getRandomNumber(1, 100);

        //if chanceOfRats >= 30 then return 0
        if (chanceOfRats >= 30) {
            return 0;
        }

        //if tithingPercent <= 8 then low =6, high = 10
        if (tithingPercent <= 8) {
            low = 6;
            high = 8;
        } //if tithingPercent >8 and tithingPercent <=12 then low=3 high =7,
        else if (tithingPercent > 8 && tithingPercent <= 12) {
            low = 3;
            high = 7;
        } //if tithingPercent > 12 then low=3 and high =5
        else {
            low = 3;
            high = 5;
        }

        // percentLost = getRandomNumber(low, high) * .01--turn this into a fraction
        percentLost = (GameControl.getRandomNumber(low, high) * .01);

        //return wheatInStorage * percentLost --will need to be turned back into an int
        return (int) (wheatInStorage * percentLost);
    }

    /**
     *
     * @author Jeremy
     * @param tithingPercent
     * @param acresPlanted
     * @return
     */
    public static int calculateHarvest(int tithingPercent, int acresPlanted) {
        //    Calculate the amount of wheat harvested, based on the percentage of tithing paid. Assume that the gameControl.getRandomNumber(low,high) is avaliable to be called

//        set variables for the function
        int low = 0;
        int high = 0;

//if acresPlanted < 0 then return -1
        if (acresPlanted < 0) {
            return -1;
        }

//if tithingPercentage < 0 or tithingPercentage > 100 return -2
//if tithing percent <8 then low=1, high = 3
//if tithingPercent >= 8 and tithingPercent <= 12 then low = 2, high = 4
//if tithingPercent > 12 then low =2, high =5
        if (tithingPercent < 0 || tithingPercent > 100) {
            return -2;
        } else if (tithingPercent > 12) {
            low = 2;
            high = 5;
        } else if (tithingPercent >= 8) {
            low = 2;
            high = 4;
        } else {
            low = 1;
            high = 3;
        }

//yield= GameControl.getRandomNumber(low, high)
        int yield = GameControl.getRandomNumber(low, high);

// return yield * acresPlanted
        return (yield * acresPlanted);
    }

}

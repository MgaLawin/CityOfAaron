/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author didimiller
 */
public class WheatControl {

    public static int calculateLossToRats(double tithingPercent, int wheatInStorage) {
        //calculate the amount of wheat in storage lost to rats, based on the percentage of tithing paid.

        //if wheatinStorage <=0 then return -1
        if (wheatInStorage <= 0) {
            return -1;
        }

        //if tithingPercent < 0 or tithingPercent > 100 return -2
        if (tithingPercent <= 0 || tithingPercent > 100) {
            return -2;
        }

        //chanceOfRats= GameControl.getRandomNumber(1,100)
        int chanceOfRats = GameControl.getRandomNumber(1, 100);

        //if chanceOfRats >= 30 then return 0
        if (chanceOfRats >= 30) {
            return 0;
        }

        //if tithingPercent < 8 then low =6, high = 10
        if (tithingPercent < 8) {
            int low = 6;
            int hight = 8;
        }

        //if tithingPercent >=9 and tithingPercent <=12 then low=3 high =7,
        if (tithingPercent >= 9 && tithingPercent <= 12) {
            int low = 3;
            int high = 7;
        }

        //if tithingPercent > 12 then low=3 and high =5
        if (tithingPercent < 12) {
            int low = 3;
            int high = 5;

        }

        // percentLost = getRandomNumber(low, high) * .01--turn this into a fraction
        int percentLost = (getRandomNumber(low, high) * .01);

        //return wheatInStorage * percentLost --will need to be turned back into an int
        return (wheatInStorage * percentLost);

    }

    public static int calculateHarvest(int tithingPercent, int acresPlanted) {
        //    Calculate the amount of wheat harvested, based on the percentage of tithing paid. Assume that the gameControl.getRandomNumber(low,high) is avaliable to be called

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
            int low = 2;
            int high = 5;
        } else if (tithingPercent > 8) {
            int low = 2;
            int high = 4;
        } else if (tithingPercent <= 8) {
            int low = 1;
            int high = 3;
        } else {
            System.out.println("Invalid Tithing Percentage!");
        }

//yield= GameControl.getRandomNumber(low, high)
        int yield = GameControl.getRandomNumber(low, high);

// return yield * acresPlanted
        return (yield * acresPlanted);
    }
}

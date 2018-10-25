/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;

/**
 *
 * @author chelseawaite
 */
public class GameControl {

    private static Random randomGenerator = new Random();

// create a a protected random number object for testing
    protected static void setRandomGenerator(Random random) {
        randomGenerator = random;
    }

    public static int getRandomNumber(int lowNumber, int highNumber) {

        //if low < 0 or high< 0 then return -1
        if (lowNumber < 0 || highNumber < 0) {
            return -1;
        }

        //if high <= low return -2
        if (highNumber <= lowNumber) {
            return -2;
        }

        //if high is the max value for the integers return -3
        if (highNumber == Integer.MAX_VALUE) {
            return -3;
        }
        // calculate the size of the range and add one so Random() includes highNumber
        int range = (highNumber - lowNumber) + 1;

//return low and random(range size)
        return lowNumber + randomGenerator.nextInt(range);

    }

    public static String createNewGame(String playerName) {
        //Returns a new Game object with everything initialized and ready for the first year of play.

        return "Game";
    }

}

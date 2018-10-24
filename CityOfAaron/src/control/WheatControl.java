/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author chelseawaite
 */
public class WheatControl {

    public static int calculateLossToRats(int tithingPercent, int wheatInStorage){
        //calculate the amount of wheat in storage lost to rats, based on the percentage of tithing paid. 
        
        //if wheatinStorage <=0 then return -1
        
        //if tithingPercent < 0 or tithingPercent > 100 return -2
        
        //chanceOfRats= GameControl.getRandomNumber(1,100)
        
        //if chanceOfRats >= 30 then return 0
        
        //if tithingPercent < 8 then low =6, high = 10
        
        //if tithingPercent >=9 and tithingPercent <=12 then low=3 high =7,
        
        //if tithingPercent > 12 then low=3 and high =5
        
        // percentLost = getRandomNumber(low, high) * .01--turn this into a fraction
        
        //return wheatInStorage * percentLost --will need to be turned back into an int
    
    }
    
    public static int calculateHarvest(int tithingPercent, int acresPlanted){
        //    Calculate the amount of wheat harvested, based on the percentage of tithing paid. Assume that the gameControl.getRandomNumber(low,high) is avaliable to be called 

//if acresPlanted < 0 then return -1

//if tithingPercentage < 0 or tithingPercentage > 100 return -2

//if tithing percent <8 then low=1, high = 3

//if tithingPercent >= 8 and tithingPercent <= 12 then low = 2, high = 4

//if tithingPercent > 12 then low =2, high =5

//yield= GameControl.getRandomNumber(low, high)

// return yield * acresPlanted
return -100;
    }
}

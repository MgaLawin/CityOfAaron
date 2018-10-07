/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Jeremy
 */
public class Game implements Serializable {

    private Player thePlayer;
    private Map theMap;
    private Storehouse theStorehouse;
    private int currentPopulation;
    private int acresOwned;
    private int wheatInStorage;

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    @Override
    public String toString() {
        return "Game{"
                + "thePlayer=" + thePlayer
                + ", theMap=" + theMap
                + ", theStorehouse=" + theStorehouse
                + ", currentPopulation=" + currentPopulation
                + ", acresOwned=" + acresOwned
                + ", wheatInStorage=" + wheatInStorage
                + '}';
    }

}

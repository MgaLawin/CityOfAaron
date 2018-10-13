/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Deon
 */
public class Provision extends InventoryItem {

    private boolean perishable;

    public boolean getperishable() {
        return perishable;
    }

    public void setperishable(boolean perishable) {
        this.perishable = perishable;
    }

}

package model;

import java.io.Serializable;

/**
 *
 * @author Deon
 */
public class Provision extends InventoryItem implements Serializable {

    private boolean perishable;

    public boolean getperishable() {
        return perishable;
    }

    public void setperishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public String toString() {
        return "Provision{" + "perishable=" + perishable + '}';
    }

}

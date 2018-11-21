package model;

import java.io.Serializable;

/**
 *
 * @author DIDIM
 */
public class InventoryItem implements Serializable {

    private ItemType ItemType;
    private int quantity;
    private Condition condition;
    private String name;

    public ItemType getItemType() {
        return ItemType;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public Condition getcondition() {
        return condition;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InventoryItem{"
            + "ItemType=" + ItemType + ","
            + " quantity=" + quantity + ","
            + " condition=" + condition + ", "
            + "name=" + name
            + '}';

    }

}

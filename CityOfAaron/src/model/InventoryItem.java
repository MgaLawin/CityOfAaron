
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;

/**
 *
 * @author DIDIM
 */
public class InventoryItem  implements Serializable{
    private  ItemType ItemType;
    private int quantity;
    private Condition condition;

    public ItemType getItemType(){
        return ItemType;
    }
                
    public int getquantity(){
        return quantity;
    }
    
    public void setquantity(int quantity){
        this.quantity= quantity;
    }
     
    public Condition getcondition(){
        return condition;
    }
    
      
}

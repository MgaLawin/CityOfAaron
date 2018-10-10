<<<<<<< HEAD
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
    private String name;
    private ItemType(enum) ItemType;
    private int quanity;
    private Condition(enum) condition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public enum getItemType(){
        return: ItemType;
    }       
    
    public void setItemType(enum Item Type type){
        this.Itemtype= ItemType;
    }

    public int getQuantity();{
        return: quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity= quantity;
    }

    public enum getCondition(){
        return: condition;
    }
    
    public void setCondition(enum Condition condition){
        this.Condition= Condition;
    }

}



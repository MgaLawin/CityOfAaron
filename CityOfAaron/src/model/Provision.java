/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Deon
 */
public class Provision {
private String name;
private boolean perishable;

public String getname(){
    return name;
}

public void setname(String name){
    this.name= name;   
}

public boolean getperishable(){
    return perishable;
}

public void setperishable(boolean perishable){
    this.perishable= perishable;
}

}


// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package control;
import model.Provision;

/**
 *
 * @author chelseawaite
 */
public class ProvisionsControl {
    
     public ProvisionsControl() {
        //empty constructor 
    }
    
//     public static createProList (){
//        
//        Provision provisions = new Provision();
//        int noOfProvisions = 3;
//        int noOfPerishable = 1;
//        
//        
//        
//        return provisions;
        
        
        
        //package com.java2novice.algos;
 //put class back where void is 
private static class Item{
    private String description;
    
    public Item(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
    
    
    public static void main(String[] args){
        Item[] items = new Item[10];
        items[0] = new Item("Water");
        items[1] = new Item("Bedding");
        items[2] = new Item("Clothes");
        items[3] = new Item("Shoes");
    
    
    for (int i=0; i < items.length-1; i++){
    
        for(int j=i+1; j < items.length; j++){
            
            if(items[i].getDescription().compareTo(items[j].getDescription()) > 0){
                Item temp = items[i];
                items[i] = items[j];
                items[j] = temp;
            }
            
        }
}
    for (Item item : items){
        System.out.println(item.getDescription());
}
}
}
}
    


//    public int[] doSelectionSort(int[] arr){
//         
//        for (int i = 0; i < arr.length - 1; i++)
//        {
//            int index = i;
//            for (int j = i + 1; j < arr.length; j++)
//                if (arr[j] < arr[index]) 
//                    index = j;
//      
//            int smallerNumber = arr[index];  
//            arr[index] = arr[i];
//            arr[i] = smallerNumber;
//        }
//        return arr;
//    }
//     
//    public void main(String a[]){
//         
//        int[] arr1 = {10,34,2,56,7,67,88,42};
//        int[] arr2 = doSelectionSort(arr1);
//        for(int i:arr2){
//            System.out.print(i);
//            System.out.print(", ");
//        }
//    }



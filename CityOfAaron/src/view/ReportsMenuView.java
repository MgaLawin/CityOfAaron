package view;

import cityofaaron.CityOfAaron;
import java.util.Scanner;
import model.Game;
import model.InventoryItem;
import model.Provision;
import model.Storehouse;

/**
 *
 * @author chelseawaite
 */
public class ReportsMenuView extends ViewBase {

    /**
     * Constructor
     */
    public ReportsMenuView() {

    }

    @Override
    protected String getMessage() {
        return "Reports Menu\n"
                + "-------------\n"
                + "A - View the animals in the storehouse.\n"
                + "T - View the tools in the storehouse.\n"
                + "P - View the provisions in the storehouse. \n"
                + "G - View the authors of this game.\n"
                + "Q - Return to the Game Menu.\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("What would you like to do?.");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                animalsInStorehouse();
                break;
            case "T":
                toolsInStorehouse();
                break;
            case "P":
                provisionsInStorehouse();
                break;
            case "G":
                authorsView();
                break;
              case "Q":
               return false;
        }
        return true;
    }

    private void animalsInStorehouse() {
        System.out.println("animalsInStorehouse will be coming soon.");
    }
 
        private void toolsInStorehouse() {
        System.out.println("--------------------------------------------\n" +
                                    "-      Tools in Storehouse                 -\n" +
                                    "--------------------------------------------\n");
        
        //get the list of tools to sort by name and number
        InventoryItem[] tools = CityOfAaron.getCurrentGame().getTheStorehouse().getTools();

        if (tools == null) {
            
            System.out.println("You currently have zero tools in the storehouse, please add some.");
             } 
        else {
            String toolName;
            int numberTools;
            //loop through the tools array get name and number of tools
            for (int i = 0; i < tools.length; i++) {
                toolName = tools[i].getname();
                numberTools = tools[i].getquantity();
                System.out.println(toolName  + "-- " + numberTools);
            }
            long total = 0;
            for (int i=0; i<tools.length ; i++) {
                numberTools = tools[i].getquantity();
                total += numberTools ;
            }
            System.out.println("There are:  " + total + " tools in the Storehouse.");
             }
          }
    

  private void provisionsInStorehouse() {
        System.out.println("--------------------------------------------\n" +
                                    "-      Provisions in Storehouse                 -\n" +
                                    "--------------------------------------------\n");
        InventoryItem[] provisions = CityOfAaron.getCurrentGame().getTheStorehouse().getProvisions();

        if (provisions == null) {
            
            System.out.println("You have no provisions in the storehouse.");
             } 
        else {
            String nameOfProvision;
            int numberOfProvisions = 0;

            for (int i = 0; i < provisions.length; i++) {
                nameOfProvision = provisions[i].getname();
                numberOfProvisions = provisions[i].getquantity();
                System.out.println(nameOfProvision  + "-- " + numberOfProvisions);
            }
            
             long total = 0;
            for (int i=0; i<provisions.length ; i++) {
                numberOfProvisions = provisions[i].getquantity();
                total += numberOfProvisions ;
            }
            System.out.println("There are:  " + total + " provisions in the Storehouse.");
             }
          }       
  
   
    private void authorsView() {
        System.out.println("authorsView will be coming soon.");
    }

}

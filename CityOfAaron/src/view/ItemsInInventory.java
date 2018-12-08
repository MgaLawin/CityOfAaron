/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author DIDIM
 */

import Exceptions.GameControlException;
import cityofaaron.CityOfAaron;
import java.io.*;
import model.InventoryItem;
import control.GameControl;

public class ItemsInInventory extends ViewBase{
      public ItemsInInventory() {
    }

    @Override
    protected String getMessage() {
        return "Send the inventory items report to file.\n";
    }
        
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter the name you would like the report to be saved as\n"
                + "or press Enter to return to the Reports Menu", true);
        return inputs;
    }

    
    @Override
    public boolean doAction(String[] inputs) {

        try {
            if (inputs[0] == null || inputs[0].equals("")) {
                throw new GameControlException("No file name entered so sending you back to the Reports Menu...");
            }
            String fileName = inputs[0];
            writeReport(fileName);
            this.console.println("Inventory Items Report saved as " + fileName);

        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        return false;
    }

    private void writeReport(String fileName) {

        InventoryItem[] tools = CityOfAaron.getCurrentGame().getTheStorehouse().getTools();

        try (PrintWriter report = new PrintWriter(new FileWriter(fileName))) {
            report.println("Items in Inventory Report");
            report.println();

            String formatString = "%-10s %-25s %10s";
            report.println(String.format(formatString,  "Provision Name", "Quantity", "Condition"));
            report.println("_______________________________________________\n");

            for (InventoryItem item : tools) {
                report.println(String.format(formatString, item.getname(), item.getquantity(), 
                        item.getcondition()));
            }
            report.println("______________________________________\n\n");

            report.flush();
        } catch (IOException exception) {
        }
    }
}

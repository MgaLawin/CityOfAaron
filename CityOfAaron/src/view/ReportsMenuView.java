package view;

import cityofaaron.CityOfAaron;
import java.util.Scanner;
import model.Game;
import model.InventoryItem;
import model.Provision;
import model.Storehouse;
import control.GameControl;

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
        return "--------------------------\n"
                + "Reports Menu\n"
                + "--------------------------\n"
                + "A - Print the animals in the storehouse.\n"
                + "T - View the tools in the storehouse.\n"
                + "I - Print the inventory report\n"
                + "P - View the provisions in the storehouse. \n"
                + "R - Print provision report\n"
                + "G - View the authors of this game.\n"
                + "Q - Return to the Game Menu.\n"
                + "--------------------------\n";
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

        inputs[0] = getUserInput("What would you like to do?");

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
            case "I":
                itemsInInventory();
                break;
            case "R":
                printProvisionsReport();
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
        AnimalReportView view = new AnimalReportView();
        view.displayView();
    }

    private void toolsInStorehouse() {
        String list = GameControl.sumTools();
        this.console.println(list);
    }

    private void provisionsInStorehouse() {
        this.console.println("--------------------------------------------\n"
                + "-      Provisions in Storehouse                 -\n"
                + "--------------------------------------------\n");
        InventoryItem[] provisions = CityOfAaron.getCurrentGame().getTheStorehouse().getProvisions();

        if (provisions == null) {

            this.console.println("You have no provisions in the storehouse.");
        } else {
            String nameOfProvision;
            int numberOfProvisions = 0;

            for (int i = 0; i < provisions.length; i++) {
                nameOfProvision = provisions[i].getname();
                numberOfProvisions = provisions[i].getquantity();
                this.console.println(nameOfProvision + "-- " + numberOfProvisions);
            }

            long total = 0;
            for (int i = 0; i < provisions.length; i++) {
                numberOfProvisions = provisions[i].getquantity();
                total += numberOfProvisions;
            }
            this.console.println("There are:  " + total + " provisions in the Storehouse.");
        }
    }

    private void authorsView() {
        this.console.println("authorsView will be coming soon.");
    }

    private void itemsInInventory() {
        ItemsInInventory view = new ItemsInInventory();
        view.displayView();
    }

    private void printProvisionsReport() {
        ProvisionReportView view = new ProvisionReportView();
        view.displayView();
    }

}

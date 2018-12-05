package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Game;
import view.View;

/**
 *
 * @author chelseawaite
 */
public class PlantCropsView extends ViewBase {

    /**
     * Constructor
     */
    public PlantCropsView() {

    }

    @Override
    protected String getMessage() {
        return "Lets plant some crops!";
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

        inputs[0] = getUserInput("How many acres of land do you want to plant?");

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

        someActionHandler();
        System.out.println("This will be coming soon. Sending you back to the Manage Crops Menu...");
        //coming soon. This will be changed back to true
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean someActionHandler() {
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.

        System.out.println("WheatControl will be will be used here soon.");

        return true;
    }
}

package view;

import control.WheatControl;
import java.util.Scanner;
import Exceptions.WheatControlException;

/**
 *
 * @author chelseawaite
 */
public class PayTithingView extends ViewBase {

    /**
     * Constructor
     */
    public PayTithingView() {

    }

    @Override
    protected String getMessage() {
        return "Time to give back to Heavenly Father.";
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

        inputs[0] = getUserInput("What percentage of their harvest they want to pay in tithes and offerings?");

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

        //someActionHandler();
        //System.out.println("This will be coming soon. Sending you back to the Manage Crops Menu...");
        //coming soon. This will be changed back to true
        //return false;
        int tithes = 0;
        boolean inputValid = false;
        
         try {
            tithes = Integer.parseInt(inputs[0]);
            WheatControl.checkTithing(tithes);
                inputValid = true;
                theTithing(tithes);
        } catch (NumberFormatException ex) {
            System.out.println("Please enter a number.");
        } catch (WheatControlException wce) {
            System.out.println(wce.getMessage());
        }

        return inputValid;

    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    //private boolean someActionHandler() {
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.

        //System.out.println("WheatControl will be will be used here soon.");

        //return true;
    //}
    
    private void theTithing(int tithingPercent) {
        //TODO stub function, to be completed after AnnualReport is implemented 
        System.out.println("Tithing percent");
    }
}

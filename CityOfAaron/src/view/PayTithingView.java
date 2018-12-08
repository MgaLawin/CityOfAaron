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

        inputs[0] = getUserInput("What percentage of your harvest will you pay as tithes and offerings?");

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

        int tithes = 0;
        boolean inputValid = false;

        try {
            tithes = Integer.parseInt(inputs[0]);
            WheatControl.checkTithing(tithes);
            inputValid = true;
            theTithing(tithes);
        } catch (NumberFormatException ex) {
            ErrorView.display(this.getClass().getName(), "Please enter a number.");
        } catch (WheatControlException wce) {
            ErrorView.display(this.getClass().getName(), wce.getMessage());
        }

        return inputValid;

    }

    private void theTithing(int tithingPercent) {
        //TODO stub function, to be completed after AnnualReport is implemented
        this.console.println("Tithing percent");
    }
}

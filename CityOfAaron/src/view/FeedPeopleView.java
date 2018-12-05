package view;

import cityofaaron.CityOfAaron;
import java.util.Scanner;
import view.GettingHelpView;

/**
 *
 * @author chelseawaite
 */
public class FeedPeopleView extends ViewBase {

    /**
     * Constructor
     */
    public FeedPeopleView() {

    }

    @Override
    protected String getMessage() {
        return "Time to feed your people!";
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

        inputs[0] = getUserInput("How many bushels of wheat do you want to feed to the people?");

        // Repeats
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
        int storedWheat;

        //Because a game hasn't technically started yet, testing this
        //returns a null value for the wheat in storage.
        storedWheat = CityOfAaron.getCurrentGame().getWheatInStorage();

        int input = 0;
        try {
            input = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "The number entered is not valid." + nfe.getMessage());
        }

        if ((inputs[0] == null) || (inputs[0].equals(""))) {
            ErrorView.display(this.getClass().getName(), "Wow, it is too cruel to starve your people. Please feed them something.");
            return true;
        }

        if (storedWheat < input || input < 0) {
            ErrorView.display(this.getClass().getName(), "Sorry, you do not have that much wheat to give.\n"
                    + "Please enter a positive value equal to or less than "
                    + "the amount of wheat currently in your storehouse.");
            return true;
        } else {
            //This updates the wheat stored.
            updateWheat(storedWheat, input);
        }

        return false;
    }

    private boolean updateWheat(int wheatStored, int wheatFed) {

        int wheatFinal = wheatStored - wheatFed;
        CityOfAaron.getCurrentGame().setWheatInStorage(wheatFinal);
        ErrorView.display(this.getClass().getName(), "You have " + wheatFinal + " units of"
                + "wheat remaining in your storehouse.");

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayView();

        return true;

    }
}

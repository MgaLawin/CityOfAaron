package view;

import cityofaaron.CityOfAaron;

/**
 *
 * @author Jeremy
 */
public class SellLandView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public SellLandView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "Sell Land\n";
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

        inputs[0] = getUserInput("How many acres of land do you want to sell?", true);

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
        //Generate a random number between 17 and 27 for the price of an acre of land and display the price.
        //Ask the user "How many acres of new land do you want to sell?"
        //The user enters a value
        //Verify the entered value is positive. If not, show a message and ask the user to enter the value again.
        //Make sure the player has this much land to sell. If not, show a message and ask the user to enter the value again.
        //Subtract the number of acres purchased from the acres owned
        //Add the wheat from the sale to the wheat in storage
        int harvest = 0;

        harvest = CityOfAaron.getCurrentGame().getWheatInStorage();

        int input = 0;
        try {
            input = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "The number provided is invalid." + nfe.getMessage());
        }

        if ((inputs[0] == null) || (inputs[0].equals(""))) {
            ErrorView.display(this.getClass().getName(), "No input was provided, please clarify.\n");
            return true;
        }

        if (input > 100 || input < 0) {
            ErrorView.display(this.getClass().getName(), "Please enter a valid percentage between 0 and 100.\n");
            return true;
        } else {
            //This updates the wheatInStorage.
            //SomeActionhandler();
        }
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void startSellLandView() {
        pause(1500);
        View sellLandMenu = new SellLandView();
        sellLandMenu.displayView();
    }
}

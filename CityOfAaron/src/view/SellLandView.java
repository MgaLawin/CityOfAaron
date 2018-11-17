package view;

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
        System.out.println("Code coming soon, for now we are returning you to the Manage the Crops Menu...");
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

package view;

import java.util.Scanner;

/**
 *
 * @author chelseawaite
 */
public class LoadGameView extends ViewBase {

    /**
     * Constructor
     */
    public LoadGameView() {

    }

    @Override
    protected String getMessage() {
        return "Lets find your saved game!\n";
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

        inputs[0] = getUserInput("(Sorry this will be working in week 12)\n"
            + " What is the file name for the saved game? \n ");

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
        // only one action- initialize the game
        // and then set it in the main cityofaaron class
        // If the user hits enter go back to main menu by returning false
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("You did not enter a valid name. Returning to the Main menu. . . ");
            return false;
        }

        //return false so we do not keep looping
        return false;

    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean findSavedGame() {
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.

        return true;
    }
}

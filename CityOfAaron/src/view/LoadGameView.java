package view;

import Exceptions.GameControlException;
import control.GameControl;
import model.Game;

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
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter the file name of your file. Example 'filename.dat' \n");

        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs) {
        // If the user hits enter go back to main menu by returning false
        String fileName = inputs[0];
        Game game = null;
        try {

            GameControl.loadGameFromFile(fileName);
            console.println("Your file was loaded successfully! ");
            View gameMenu = new GameMenuView();
            gameMenu.displayView();
        } catch (GameControlException ex) {
            ErrorView.display("Game Control Exception:", ex.getMessage());
        }

        return false;
    }
}

package view;

import cityofaaron.CityOfAaron;
import control.GameControl;
import model.Game;
import Exceptions.GameControlException;

/**
 *
 * @author DIDIM
 */
public class SaveGameView extends ViewBase {

    protected String message;

    /**
     * Constructor
     *
     * The program will prompt the user for where the file should be saved if
     * the game state is saved to a file, the computer will display a success-
     * not working yet- will stub if the game state is not saved the program
     * will throw and error Then the computer will return to the main menu
     *
     */
    @Override
    protected String getMessage() {
        return "Thank you for playing the game, let's save your game!";

    }

    /**
     * The program will prompt the user for where the file should be saved if
     * the game state is saved to a file, the computer will display a success-
     * not working yet- will stub if the game state is not saved the program
     * will throw and error
     *
     * @return
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter the file name of your file. Example 'filename.dat' \n");

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        // If the user hits enter go back to main menu by returning false

        Game game = CityOfAaron.getCurrentGame();
        String fileName = inputs[0];
        try {
            // add a call to the file save method
            if (true == GameControl.saveGameToFile(game, fileName)) {
                console.println("Your file was saved successfully! ");
                return false;
            }
        } catch (GameControlException ex) {
            ErrorView.display("Game Control Exception:", ex.getMessage());
        }
        return true;
    }

}

package view;

import cityofaaron.CityOfAaron;
import control.GameControl;
import model.Game;
import Exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        inputs[0] = getUserInput("Please enter the file path and name of your file. example 'C:\\temp\\filename.txt' \n");

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        // If the user hits enter go back to main menu by returning false
  
        Game game = CityOfAaron.getCurrentGame();
        String fileName = inputs[0];
        try {
            // add a call to the file save method
            GameControl.saveGameToFile(game, fileName);
        } catch (GameControlException ex) {
            Logger.getLogger(SaveGameView.class.getName()).log(Level.SEVERE, null, ex);
        }
         return true;
    }

}

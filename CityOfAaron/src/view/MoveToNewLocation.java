package view;

import cityofaaron.CityOfAaron;
import model.Game;
import Exceptions.MapControlException;
import control.MapControl;
import model.Point;

/**
 *
 * @author DIDIM
 */
public class MoveToNewLocation extends ViewBase {

    /**
     * Constructor
     */
    public MoveToNewLocation() {

    }

    @Override
    protected String getMessage() {
        return "Where would you like to move to? Enter the two coordinates on the map";
    }

    //get the set of user inputs
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get
        // from the user.
        String[] inputs = new String[2];

        inputs[0] = getUserInput("Please enter the first coordinate:", true);
        inputs[1] = getUserInput("Please enter the second coordinate:", true);

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view. add an exception to this
     * view for group project
     */
    @Override
    public boolean doAction(String[] inputs) {
        // define the variables set to zero
        int row;
        int column;

        try {
            // change the user entered string into an int -parseInt
            row = Integer.parseInt(inputs[0]);
            column = Integer.parseInt(inputs[1]);
            MapControl.checkNewLocation(row, column);
            // created a variable so that we could continue the try
            MapControl.MoveToNewLocation(row, column);
        } catch (NumberFormatException ex) {
            this.console.println("You entered an invalid number. Please enter a number between 0-4 for each prompt \n");
            return true;
        } catch (MapControlException mce) {
            this.console.println(mce.getMessage());
            return true;
        }

        return false;
    }

}

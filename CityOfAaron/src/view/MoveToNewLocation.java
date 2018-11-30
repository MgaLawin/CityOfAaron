package view;

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
        int row = 0;
        int column = 0;
        boolean inputInt = false;

        try {
            // change the user entered string into an int -parseInt
            row = Integer.parseInt(inputs[0]);
            column = Integer.parseInt(inputs[1]);
            MapControl.checkNewLocation(row, column);
            // created a variable so that we could continue the try
            inputInt = true;
            MoveToNewLocation(row, column);
        } catch (NumberFormatException ex) {
            System.out.println("You entered an invalid number. Please enter a number between 0-4 for each prompt \n");

        } catch (MapControlException mce) {
            System.out.println(mce.getMessage());
        }

        return true;
    }

    private void MoveToNewLocation(int row, int column) {
        Point point = new Point();
        point.setRow(row);
        point.setColumn(column);

        // stub because this is not done yet
        System.out.println("This is not currently working- may be working soon. Will send you back to the game menu for now.\n");
        // TODO send back to the game menu- so we do not have a loop   

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayView();
    }
}

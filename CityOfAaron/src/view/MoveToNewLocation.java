package view;

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
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {
        // only one action- initialize the game
        // and then set it in the main cityofaaron class

        // If the user hits enter go back to game menu by returning false
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("This feature is not currently available. Returning to the game menu. . . ");
            return false;
        }
        // return false if you want this view to exit and return
        // to the view that called it.

        //return false so we do not keep looping
        return false;

    }

    private void moveToNewLocation(String[] inputs) {
        //this has not been built yet, when it is this is were we will call it and move the player 

    }

}

package view;

import cityofaaron.CityOfAaron;
import model.Location;

/**
 *
 * @author DIDIM
 */
public class ViewTheMapView extends ViewBase {

    protected String message;

    /**
     * Constructor
     *
     * The view the map displays the map and immediately returns to the game
     * menu. It will have be a 2 dimensional array of locations It will be at
     * least 5 x 5 Each location will have a symbol, a name and what can be
     * seen. After the map is displayed the program will return to the Game Menu
     *
     */
    @Override
    protected String getMessage() {
        return null;

    }

    /**
     * There are no inputs from the user return null
     *
     * @return
     */
    @Override
    protected String[] getInputs() {
        return null;
    }

    @Override
    public boolean doAction(String[] inputs) {

        displayMap();
        return false;
    }

    public void displayMap() {
        // print out the map
        Location[][] locations = CityOfAaron.getCurrentGame().getTheMap().getLocation();

        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                System.out.print(locations[row][column].getMapSymbol() + " ");
            }
            System.out.println();

        }

    }
}

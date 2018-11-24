package view;

import cityofaaron.CityOfAaron;
import control.MapControl;
import model.Location;
import model.Map;

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

        Map map = MapControl.createMap();

        // public void displayMap() {
        // print out the map
        Location[][] locations = CityOfAaron.getCurrentGame().getTheMap().getLocation();
        System.out.println();

        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                System.out.print(locations[row][column].getMapSymbol() + " ");
            }
            System.out.println();

        }
        System.out.println("------------------------------");
        System.out.println("B- Border");
        System.out.println("C - Ruler's Court");
        System.out.println("D - Village of Deon");
        System.out.println("F - Wheat field");
        System.out.println("J - Village of Jeremy");
        System.out.println("R - River");
        System.out.println("S - Storehouse");
        System.out.println("T - Temple");
        System.out.println("U - Undeveloped land");
        System.out.println("V - Village");
        System.out.println("W - Watchtower");
        System.out.println("Y - Village of Chelsey");
        System.out.println("------------------------------");
        pause(1500);
        return false;
    }
}

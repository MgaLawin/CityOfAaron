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

//    @Override
//    public boolean doAction(String[] inputs) {
//
//        Map map = MapControl.createMap();
//       
////    public void displayMap() {
//        // print out the map
//        Location[][] locations = CityOfAaron.getCurrentGame().getTheMap().getLocation();
//
//        for (int row = 0; row < locations.length; row++) {
//            for (int column = 0; column < locations[row].length; column++) {
//                System.out.printf("%3s", locations[row][column].getMapSymbol() + " ");
//            }
//            System.out.println();
//
//        }
//        return false;
//
//    }
      @Override
    public boolean doAction(String[] inputs) {
       
        // return false if you want this view to exit and return
        // to the view that called it.

        displayMap();
        return false;
    }
    
    public void displayMap() {
        System.out.println("As the ruler of the City of Aaron,");
        System.out.println("you have access to the city map and its secrets.");
        System.out.println("------------------------------");
        
        Map map = MapControl.createMap();    
        Location[][] locations = map.getLocation();

        for (int i = 0; i < locations.length; i++) {

            for (int j = 0; j < locations[i].length; j++) {
                System.out.printf("%3s", map.getLocation()[i][j].getMapSymbol());
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        System.out.println("C - Ruler's Court");
        System.out.println("S - City Granary and Storehouse");
        System.out.println("F - Wheat field");
        System.out.println("U - Undeveloped land");
        System.out.println("V - Village");
        System.out.println("R - River"); 
        System.out.println("B - Border of the Lamanite lands");
        System.out.println("T - Temple");
        System.out.println("W - Watchtower\n"); 
        pause(1500);
    }
}

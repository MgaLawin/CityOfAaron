package view;

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
        return "The official map will be created in the coming weeks, Here is an example of what it may look like:\n"
            + "------------------------------------------------------------------------------------------------------------\n"
            + "-__________________________________________________________________________________________________________-\n"
            + "-_____________________|_____________________|_____________________|____________________|___________________| -\n"
            + "-                           |                           |                          |                         |                      | -\n"
            + "- [ G ] grainery 1    |  [V] village 1        |  [T] The Temple  |  [W] Wheat       | [U] Undefined | -\n"
            + "-_____________________|_____________________|_____________________|____________________|__________________| -\n"
            + "-                           |                           |                          |                         |                      | -\n"
            + "- [U] Undefined     |  [U] Undefined    |   [U] Undefined   |  [W] Wheat2    |  [W] Wheat3   | -\n"
            + "-____________________|___________ __________|_____________________|____________________|__________________|-\n"
            + "-                           |                           |                          |                         |                      | -\n"
            + "- [U] Undefined     |  [U] Undefined    |   [U] Undefined   |  [W] Wheat 4    | [U] Undefined|-\n"
            + "-_____________________|_____________________|_____________________|____________________|_________________| -\n"
            + "-                           |                           |                          |                         |                      | -\n"
            + "- [U] Undefined     |  [U] Undefined    |  [U] Undefined    |  [W] Wheat 5    |[U] Undefined | -\n"
            + "-_____________________|_____________________|_____________________|____________________|__________________| -\n"
            + "-                           |                           |                          |                         |                      | -\n"
            + "- [U] Undefined     |  [V] village 2        |  [G] Grainery 2   |  [W] Wheat 6    |[U] Undefined  | -\n"
            + "-_____________________|_____________________|_____________________|____________________|__________________| -\n"
            + "------------------------------------------------------------------------------------------------------------\n";

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
        // There are no inputs for this view  yet we are just going to pause for a few seconds and then load the game menu
        GameMenuView();
        return false;
    }

    // display the game menu
    private void GameMenuView() {
        GameMenuView view = new GameMenuView();
        view.displayView();
    }
}

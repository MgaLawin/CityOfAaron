package view;

import java.util.Scanner;

/**
 *
 * @author DIDIM
 */
public class ViewTheMapView {

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
    public ViewTheMapView() {

        message = "The official map will be created in the coming weeks, Here is an example of what it may look like:\n"
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
                + "- [U] Undefined     |  [V] village 2        |  [G] Grainery 2   |  [W] Wheat 6    |[U] Undefined  | ---\n"
                + "-_____________________|_____________________|_____________________|____________________|__________________| -\n"
                + "------------------------------------------------------------------------------------------------------------\n";

    }

    /**
     * There is not really any input, we will ask the user to hit enter to
     * continue
     *
     * @param prompt
     * @param allowEmpty
     * @return
     */
    protected String getUserInput(String prompt, boolean allowEmpty) {

        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;

        while (inputReceived == false) {

            System.out.println(prompt);
            input = keyboard.nextLine();

            // Make sure we avoid a null-pointer error.
            if (input == null) {
                input = "";
            }

            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();

            if (input.equals("") == false || allowEmpty == true) {
                inputReceived = true;
            }
        }

        return input;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return
     */
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Hit 'enter' to access the Game menu", true);

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        GameMenuView();
        return false;
    }

    // display the game menu
    private void GameMenuView() {
        GameMenuView view = new GameMenuView();
        view.displayView();
    }

    // control the view
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {

            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.

    private boolean someActionHandler() {
        // this will eventually getTheMap  control and display it
        //  for now, it will just return the hard map and return to the GameMenu
        return true;
    }

}

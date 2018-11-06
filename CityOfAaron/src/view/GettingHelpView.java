package view;

import java.util.Scanner;

/**
 *
 * @author JeremyHawks
 */
public class GettingHelpView {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public GettingHelpView() {

        message = "Help Menu.\n"
                + "-------------\n"
                + "A - What are the goals of the game?\n"
                + "B - Where is the City of Aaron?\n"
                + "C- How do I view the map?\n"
                + "D - How do I move to another location?\n"
                + "E - How do I display a list of animals, provisions and tools in the city storehouse?\n"
                + "-------------\n"
                + "Q - Quit back to the Main Menu.\n";

    }

    /**
     * Get the user's input. Keep prompting them until they enter a value.
     *
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a
     * return key)
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

        inputs[0] = getUserInput("Please select a Help topic or press Enter to return to the main menu.", true);

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
    public boolean doAction(String[] inputs) {
        // Act on the user's input.
        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                System.out.println("What are the goals of the game?\n"
                        + "---------------------------------------\n"
                        + "The goal of the game is to be a successful leader.\n"
                        + "To be successful you must:\n"
                        + "-Increase your city's population\n"
                        + "-Increase the size of your city\n"
                        + "-Plant and harvest as many bushels of wheat as possible\n");
                break;
            case "B":
                System.out.println("Where is Aaron City?\n"
                        + "---------------------------------------\n"
                        + "Aaron City is a fictionalized city set in Book of Mormon times.\n"
                        + "It is located in Column C, Row 3 on the map\n");
                break;
            case "C":
                System.out.println("How do I view the map?\n"
                        + "---------------------------------------\n"
                        + "To view the map, start a game and\n"
                        + "from the Game Menu select the option of:\n"
                        + "View the map\n");
                break;
            case "D":
                System.out.println("How do I move to another location?\n"
                        + "---------------------------------------\n"
                        + "To move to a new location, start a game and\n"
                        + "from the Game Menu select the option of:\n"
                        + "Move to a new location\n"
                        + "You will be prompted for the coordinates of\n"
                        + " the location you would like to move to\n");
                break;
            case "E":
                System.out.println("How do I display a list of animals, provisions and tools in the city storehouse?\n"
                        + "---------------------------------------\n"
                        + "To display a storehouse inventory list, start a game and\n"
                        + "from the Game Menu select the option of:\n"
                        + "Reports Menu\n"
                        + "Select the option for the report you would like to view\n");
                break;
            case "Q":
                System.out.println("Returning to Main Menu...");
                return false;
        }
        return true;
    }

    /**
     * Control this view's display/prompt/action loop until the user chooses and
     * action that causes this view to close.
     */
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
    private void startGettingHelpView() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException exception) {
            //ignore this exception for now
        }
        GettingHelpView helpMenu = new GettingHelpView();
        helpMenu.displayView();
    }
}

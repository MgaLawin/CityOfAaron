package view;

import java.util.Scanner;

/**
 *
 * @author kanderson
 */
public class StartProgramView {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public StartProgramView() {

        message = "\n\n****************************************************************************************\n"
                + " Welcome to the city of Aaron. You have been chosen be the chief ruler in the city.\n"
                + " Your responsibilities are to buy and sell land, determine how much wheat to plant each year\n "
                + "and how much to set aside to feed the people. You are also responsible to pay the annual\n "
                + "tithing on the wheat that is harvested. If you fail to provide enough wheat for the people,\n"
                + " people will starve, some people will die, and your workforce will be diminished.\n  "
                + "If too many people die you will be kicked out of office and  the game will end. \n"
                + "Plan carefully. Also beware, there is always a danger of rats eating your wheat . . .\n"
                + "**************************************************************************************************\n";

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

        inputs[0] = getUserInput("Would you like to give it a try? Hit 'enter' to access the main menu", true);

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
        // There are no inputs for this view we are just going to pause for a few seconds and then load the main menu

        startMainMenuView();
        return false;
    }

    /**
     * Control this views display/prompt/action loop until the user chooses and
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
    private void startMainMenuView() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException exception) {
            //ignore this exception for now
        }
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}

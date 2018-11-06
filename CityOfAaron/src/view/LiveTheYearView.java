package view;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class LiveTheYearView {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public LiveTheYearView() {

        message = "Live the Year\n"
                + "--------------------\n"
                + "E - End Year and Calculate Results\n"
                + "Q - Return to Game Menu - Do not end the year yet.";

    }

    /////This is not going to change for the rest of the semester
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

    /////This is not going to change for the rest of the semester end
    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("What would you like to do?.");

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

        switch (inputs[0].trim().toUpperCase()) {
            case "E":
                liveTheYear();
                break;
            case "Q":
                System.out.println("Returning to Game Menu...");
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

    private void liveTheYear() {
        System.out.println("liveTheYear coming soon.");
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean someActionHandler() {
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.

//1. The number of bushels of wheat harvested.
//2. The number of bushels of wheat paid in offerings.
//3. The total number of bushels of wheat in store after steps 1 & 2.
//4. The number of bushels of wheat in store eaten by rats. This value is subtracted from the wheat in store.
//5. The number of people that starve because they don't have enough wheat.
//6. The number of number of poeple that move into the city.
//7. Program returns to the Game Menu, displaying the annual report.
        return true;
    }
}

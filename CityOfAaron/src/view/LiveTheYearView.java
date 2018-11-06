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
                + "-------------------\n"
                + "Calculating...\n"
                + "1. The number of bushels of wheat harvested.\n"
                + "2. The number of bushels of wheat paid in offerings. \n"
                + "3. The total number of bushels of wheat in store after steps 1 & 2.\n"
                + "4. The number of bushels of wheat in store eaten by rats. This value is subtracted from the wheat in store. \n"
                + "5. The number of people that starve because they don't have enough wheat. \n"
                + "6. The number of number of poeple that move into the city. \n"
                + "Reporting...\n"
                + "Program returns to the Game Menu, displaying the annual report.\n";

    }

    /**
     * Perform the Live the Year actions.
     */
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

        return true;
    }
}

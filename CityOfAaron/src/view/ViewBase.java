/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author chelseawaite
 */
public abstract class ViewBase implements View {

    /*Constructor*/
    public ViewBase() {

    }

    //Get the view's content. This will allow the view to have dynamic content*/
    protected abstract String getMessage();

    //Get the set of inputs from the user
    protected abstract String[] getInputs();

    //Perform the action indicated by the user's input
    public abstract boolean doAction(String[] inputs);

    //Controls this view's display/prompt/action loop until
    //the user chooses an action that causes this view to close
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {
            // get the message that should be displayed.
            // Only print it if it is non-null
            String message = getMessage();
            if (message != null) {
                System.out.println(getMessage());
            }

            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
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

package view;

import java.util.Scanner;

/**
 *
 * @author chelseawaite
 */
public class ReportsMenuView extends ViewBase {


    /**
     * Constructor
     */
    public ReportsMenuView() {


    }
    @Override
    protected String getMessage(){
        return "Reports Menu\n"
                + "-------------\n"
                + "A - View the animals in the storehouse.\n"
                + "T - View the tools in the storehouse.\n"
                + "P - View the provisions in the storehouse. \n"
                + "G - View the authors of this game.\n";
    }

    
    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
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
    @Override
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                animalsInStorehouse();
                break;
            case "T":
                toolsInStorehouse();
                break;
            case "P":
                provisionsInStorehouse();
                break;
            case "G":
                authorsView();
                break;
        }
        return true;
    }

    

    private void animalsInStorehouse() {
        System.out.println("animalsInStorehouse will be coming soon.");
    }

    private void toolsInStorehouse() {
        System.out.println("toolsInStorehouse will be coming soon.");
    }

    private void provisionsInStorehouse() {
        System.out.println("provisionsInStorehouse will be coming soon.");
    }

    private void authorsView() {
        System.out.println("authorsView will be coming soon.");
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

        return true;
    }
}

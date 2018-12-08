package view;

import control.AnimalControl;

/**
 *
 * @author Jeremy
 */
public class AnimalReportView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public AnimalReportView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "Animal Report Menu\n"
                + "-------------\n"
                + "P - Print the animals in the storehouse.\n"
                + "Q - Return to the previous menu.\n"
                + "-------------\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter the file path and name of your file. Example 'C:\\temp\\filename.dat' \n");

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
//    @Override
//    public boolean doAction(String[] inputs) {
//        //Display the report of the animals in the storehouse.
//        String animalReport = AnimalControl.animalsInStorehouse();
//        String fileName = inputs[0];
//
//        try {
//            // add a call to the file save method
//            if (true == AnimalControl.animalsInStorehouse(animalReport, fileName)) {
//                console.println("Your report was saved successfully! ");
//                return false;
//            }
//        } catch (AnimalControlException ex) {
//            ErrorView.display("Animal Control Exception:", ex.getMessage());
//        }
//        return true;
//  }
}

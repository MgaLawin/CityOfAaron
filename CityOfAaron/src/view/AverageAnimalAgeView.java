package view;

import control.AnimalControl;
import model.Animal;

/**
 *
 * @author Jeremy
 */
public class AverageAnimalAgeView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public AverageAnimalAgeView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "Average Animal Age\n"
                + "-----------------------\n"
                + "Calculating the average age of the animals in the storehouse...\n"
                + "-----------------------\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // This view is not interactive. It just shows the game description.
        return null;
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
        //Display the average age of the animals in the storehouse.

//        Animal animal = AnimalControl.averageAgeOfAnimals();
//
//        System.out.println();
//        for (int row = 0; row < locations.length; row++) {
//            for (int column = 0; column < locations[row].length; column++) {
//                System.out.print(locations[row][column].getMapSymbol() + " ");
//            }
//            System.out.println();
//        }
        return false;
    }

    private void AverageAnimalAgeView() {
        pause(1500);
        AverageAnimalAgeView view = new AverageAnimalAgeView();
        view.displayView();
    }
}

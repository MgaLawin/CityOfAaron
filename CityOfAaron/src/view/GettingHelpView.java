package view;

/**
 *
 * @author JeremyHawks
 */
public class GettingHelpView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public GettingHelpView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "Help Menu.\n"
                + "-------------\n"
                + "A - What are the goals of the game?\n"
                + "B - Where is the City of Aaron?\n"
                + "C- How do I view the map?\n"
                + "D - How do I move to another location?\n"
                + "E - How do I display a list of animals, provisions and tools in the city storehouse?\n"
                + "-------------\n"
                + "Q - Quit back to the Main Menu.\n"
                + "-------------\n"
                + "X - Calculate the average age of animals in the storehouse\n";
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
    @Override
    public boolean doAction(String[] inputs) {
        // Act on the user's input.
        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                System.out.println("What are the goals of the game?\n"
                        + "---------------------------------------\n"
                        + "The goal of the game is to be a successful leader.\n"
                        + "To be successful you must:\n"
                        + "-Increase your city's population\n"
                        + "-Increase the size (acreage) of your city\n"
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
            case "X":
                averageAnimalAgeView();
                break;
        }
        return true;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void startGettingHelpView() {
        pause(1500);
        View helpMenu = new GettingHelpView();
        helpMenu.displayView();
    }

    private void averageAnimalAgeView() {
        AverageAnimalAgeView view = new AverageAnimalAgeView();
        view.displayView();
    }

}

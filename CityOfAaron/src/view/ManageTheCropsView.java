package view;

/**
 *
 * @author Jeremy
 */
public class ManageTheCropsView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public ManageTheCropsView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "Manage the Crops\n"
            + "--------------------------\n"
            + "B - Buy Land\n"
            + "S - Sell Land\n"
            + "F - Feed the People\n"
            + "P - Plant Crops\n"
            + "T - Pay Tithes and Offerings\n"
            + "Q - Return to the Game Menu\n";
    }

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
            case "B":
                buyLand();
                break;
            case "S":
                sellLand();
                break;
            case "F":
                feedThePeople();
                break;
            case "P":
                plantCrops();
                break;
            case "T":
                payTithesAndOfferings();
                break;
            case "Q":
                System.out.println("Returning to Game Menu...");
                return false;
        }
        return true;
    }

    private void buyLand() {
        View view = new BuyLandView();
        view.displayView();
    }

    private void sellLand() {
        View view = new SellLandView();
        view.displayView();
    }

    private void feedThePeople() {
        View view = new FeedPeopleView();
        view.displayView();
    }

    private void plantCrops() {
        View view = new PlantCropsView();
        view.displayView();
    }

    private void payTithesAndOfferings() {
        View view = new PayTithingView();
        view.displayView();
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean someActionHandler() {
        // Eventually this will run processes to manage the crops
        System.out.println("Actions to manage your crops will be implemented here soon.");
        return true;
    }
}

package view;

/**
 *
 * @author DIDIM
 */



//The Game Menu View controls the play of the game.
public class GameMenuView extends ViewBase {

    protected String message;

    /**
     * Constructor
     */
    public GameMenuView() {

    }

@Override
    protected String getMessage() {
        return "GameMenu\n"
                + "-------------\n"
                + "V - View the Map\n"
                + "N - Move to a New Location\n"
                + "C - Manage the Crops\n"
                + "R - Reports Menu\n"
                + "S - Save the Game\n"
                + "M - Return to the Main Menu\n"
                + "Q - Quit the Game";
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

        inputs[0] = getUserInput("What would you like to do? Enter a Letter.");

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
            case "V":
                ViewTheMapView();
                break;
            case "N":
                MoveToNewLocation();
                break;
            case "C":
                ManageTheCropsView();
                break;
            case "R":
                ReportsMenuView();
                break;
            case "S":
                SaveGameView();
                break;
            case "M":
                MainMenuView();
                break;
            case "Q":
                EndGameView();
                break;
        }
        return true;
    }

      
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean someActionHandler() {
     
        return true;
    }
 private void MainMenuView() {
        MainMenuView view = new MainMenuView();
        view.displayView();
    }

    private void SaveGameView() {
        SaveGameView view = new SaveGameView();
        view.displayView();
    }

    private void ReportsMenuView() {
        ReportsMenuView view = new ReportsMenuView();
        view.displayView();
    }

    private void ManageTheCropsView() {
        ManageTheCropsView view = new ManageTheCropsView();
        view.displayView();
    }

    private void MoveToNewLocation() {
        MoveToNewLocation view = new MoveToNewLocation();
        view.displayView();
    }

    private void ViewTheMapView() {
        ViewTheMapView view = new ViewTheMapView();
        view.displayView();
    }

    private void EndGameView() {
        EndGameView view = new EndGameView();
        view.displayView();
    }
       
}

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

        message = "GameMenu\n"
                + "-------------\n"
                + "V - View the Map\n"
                + "N - Move to a New Location\n"
                + "C - Manage the Crops\n"
                + "L - Live the year\n"
                + "R - Reports Menu\n"
                + "S - Save the Game\n"
                + "M - Return to the Main Menu\n"
                + "Q - Quit the Game";
    }

  
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return
     */
    @Override
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
//          case "L":
//              LiveTheYear();
//              break;
            case "R":
                ReportsMenuView();
                break;
            case "S":
                SaveTheMenu();
                break;
            case "M":
                MainMenuView();
                break;
            case "Q":
                System.out.println("Thank you for playing. Bye.");
                return false;
        }
        return true;
    }

       private void MainMenuView() {
        MainMenuView view = new MainMenuView();
        view.displayView();
    }

    private void SaveTheMenu() {
        System.out.println("Save the Menu coming soon.");
    }

    private void ReportsMenuView() {
        ReportsMenuView view = new ReportsMenuView();
        view.displayView();
    }

    private void ManageTheCropsView() {
        ManageTheCropsView view = new ManageTheCropsView();
        view.displayView();
    }

//    private void LiveTheYear() {
//        LiveTheYear view = new LiveTheYear();
//        view.displayView();
//    }
    private void MoveToNewLocation() {
        System.out.println("Move to New Location coming soon.");
    }

    private void ViewTheMapView() {
        ViewTheMapView view = new ViewTheMapView();
        view.displayView();
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

    @Override
    protected String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

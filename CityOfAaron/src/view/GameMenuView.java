package view;
import control.MapControl;
import model.Map;
import model.Location;

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
            + "M - Move to a New Location\n"
            + "A - View the Annual Report\n"
            + "C - Manage the Crops\n"
            + "R - Reports Menu\n"
            + "S - Save the Game\n"
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
                displayMap();
                break;
            case "A":
                AnnualReportView();
                break;
            case "M":
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

      private void AnnualReportView() {
       AnnualReportView view = new AnnualReportView();
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

//    private void ViewTheMapView() {
//        ViewTheMapView view = new ViewTheMapView();
//        view.displayView();
//    }
    
    public void displayMap() {
        Map map = MapControl.createMap();
        Location[][] locations = map.getLocation();
        
        for(int i = 0; i < locations.length; i++){
            for (int j = 0; j < locations[i].length; j++){
                System.out.println(map.getLocation()[i][j].getMapSymbol());
            }
            System.out.println();
        }
    }

    private void EndGameView() {
        EndGameView view = new EndGameView();
        view.displayView();
    }

}

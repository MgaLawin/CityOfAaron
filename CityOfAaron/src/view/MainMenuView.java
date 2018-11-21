package view;

/**
 *
 * @author kanderson
 */
public class MainMenuView extends ViewBase {

    /**
     * Constructor
     */
    public MainMenuView() {

    }

    @Override
    protected String getMessage() {
        return "Main Menu\n"
            + "-------------\n"
            + "N - Start a New Game\n"
            + "L - Load a Saved Game\n"
            + "H - Help Menu\n"
            + "S - Save Game"
            + "Q - Quit\n";
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
            case "N":
                startNewGame();
                break;
            case "L":
                loadSavedGame();
                break;
            case "H":
                helpMenu();
                break;
            case "S":
                saveGameView();
                break;
            case "Q":
                System.out.println("Thank you for playing. Bye.");
                return false;
        }
        return true;
    }

    private void startNewGame() {
        NewGameView view = new NewGameView();
        view.displayView();
    }

    private void helpMenu() {
        GettingHelpView view = new GettingHelpView();
        view.displayView();
    }

    private void loadSavedGame() {
        LoadGameView view = new LoadGameView();
        view.displayView();
         }
    private void  saveGameView(){
        SaveGameView view = new SaveGameView();
        view.displayView();
    }

}

package view;

/**
 *
 * @author Jeremy
 */
public class AnnualReportView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public AnnualReportView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "Annual Report.\n"
            + "-----------------------\n"
            + "The current year is: currentYear.\n"
            + "peopleStarved people starved this year.\n"
            + "The current population is: currentPopulation.\n"
            + "Total acres currently owned is: acresOwned.\n"
            + "bushelsHarvested bushels of wheat were harvested this year.\n"
            + "bushelsTithed bushels of wheat were paid in offerings this year.\n"
            + "lossToRats bushels of wheat were lost to rats this year.\n"
            + "There are wheatInStorehouse bushels of wheat in the storehouse.\n"
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
        //Display the current year.
        //Display how many people starved
        //Display the current population
        //Display the total acres owned
        //Display the number of bushels harvested
        //Display the number of bushels paid in offerings
        //Display the number of bushels lost to rats
        //Display the number of bushels in the storehouse
        System.out.println("Code coming soon, for now we are returning you to the Manage the Crops Menu...\n");
        return false;
    }

    private void startAnnualReportView() {
        pause(1500);
        View annualReportMenu = new AnnualReportView();
        annualReportMenu.displayView();
    }
}

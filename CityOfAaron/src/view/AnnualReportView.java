package view;

import model.AnnualReport;
import cityofaaron.CityOfAaron;
import control.GameControl;
import model.Game;
import Exceptions.GameControlException;
import Exceptions.PeopleControlException;
import Exceptions.WheatControlException;

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
        //super();
    }

    @Override
    protected String getMessage() {

        return "Annual Report.\n"
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
        //------------------------------------------
//        AnnualReport calcLiveTheYear = calculateLiveTheYear();
//        int peopleStarved = calcLiveTheYear.getPeopleStarved();
//        int peopleMovedIn = calcLiveTheYear.getPeopleMovedIn();
//        int endingPopulation = calcLiveTheYear.getEndingPopulation();
//        int endingAcresOwned = calcLiveTheYear.getEndingAcresOwned();
//        int bushelsHarvested = calcLiveTheYear.getBushelsHarvested();
//        int tithingAmount = calcLiveTheYear.getTithingAmount();
//        int lostToRats = calcLiveTheYear.getLostToRats();
//        int endingWheatInStorage = calcLiveTheYear.getEndingWheatInStorage();
//        int landPrice = calcLiveTheYear.getLandPrice();
//
//        this.console.println("Annual Report!\n"
//                + " = Year Number\n"
//                + peopleStarved + " = Number of people that starved\n"
//                + peopleMovedIn + " = People who moved in to the city\n"
//                + endingPopulation + " = Current population\n"
//                + endingAcresOwned + " = Acres of land owned by the city\n"
//                + bushelsHarvested + " = Bushels harvested\n"
//                + tithingAmount + " = Bushels of wheat paid in offerings\n"
//                + lostToRats + " = Bushels of wheat lost to rats\n"
//                + endingWheatInStorage + " = Bushels of Wheat in Storage\n"
//                + landPrice + " = Land price this year\n"
//        );
        return false;
    }

//    private void startAnnualReportView() {
//        pause(1500);
//        View annualReportMenu = new AnnualReportView();
//        annualReportMenu.displayView();
//    }
    public static AnnualReport calculateLiveTheYear() throws WheatControlException, PeopleControlException {

        Game currentGame = CityOfAaron.getCurrentGame();
        AnnualReport calcLiveTheYear = null;
        try {
            calcLiveTheYear = GameControl.calcLiveTheYear(currentGame, -10, 1000, 1000);
            return calcLiveTheYear;
        } catch (GameControlException ie) {
            ErrorView.display("AnnualReportView", ie.getMessage());
            return null;
        }
    }
}

package control;

import Exceptions.GameControlException;
import Exceptions.PeopleControlException;
import Exceptions.WheatControlException;
import model.AnnualReport;
import model.Game;
import view.ErrorView;

/**
 *
 * @author Jeremy
 */
public class LiveTheYear {

    /**
     * Process the current year's results and update the Game object
     *
     * @param game The current Game object (pass by reference)
     * @param tithingPercent The percentage of tithing selected for the year
     * @param bushelsForFood The number of bushels of wheat allocated as food
     * for the year
     * @param acresPlanted The number of acres to be used for planting
     *
     * @return The year's Annual Report data
     * @throws Exceptions.GameControlException
     * @throws Exceptions.PeopleControlException
     */
    public static AnnualReport liveTheYear(
            Game game, int tithingPercent,
            int bushelsForFood, int acresPlanted) throws GameControlException, PeopleControlException {
        if (game == null || tithingPercent < 0 || tithingPercent > 100
                || bushelsForFood < 0 || acresPlanted < 0) {
            return null;
        }

        AnnualReport report = new AnnualReport();

        //uncomment code once methods and variables are created in appropriate locations
        //report.setLandPrice(LandControl.getCurrentLandPrice());
        int totalWheat = game.getWheatInStorage();

        int harvested = 0;
        try {
            harvested = WheatControl.calculateHarvest(tithingPercent, acresPlanted);
        } catch (WheatControlException ex) {
            ErrorView.display("Wheat Control Exception:", ex.getMessage());
        }
        //int tithingPercent = (int) (double) ((tithingPercentagePaid / 100.0) * harvested);
        int lostToRats = 0;
        try {
            lostToRats = WheatControl.calculateLossToRats(tithingPercent, totalWheat);
        } catch (WheatControlException ex) {
            ErrorView.display("Wheat Control Exception:", ex.getMessage());
        }
        try {
            int peopleStarved = PeopleControl.calculateMortality(bushelsForFood, game.getCurrentPopulation());

            // TODO calculate mortatility rate if greater than 50%- send to end of game
            //TODO create an array of the years lived if 10 end the game view
            //int peopleMovedIn = PeopleControl.calculateNewMoveIns(game.getCurrentPopulation());
            //totalWheat = totalWheat + harvested - tithingAmount - lostToRats;
            game.setWheatInStorage(totalWheat);
            //report.setCurrentPopulation(game.getCurrentPopulation() - peopleStarved + peopleMovedIn);

            report.setBushelsHarvested(harvested);
            //report.setTithingAmount(tithingAmount);
            report.setLostToRats(lostToRats);
            report.setPeopleStarved(peopleStarved);
            //report.setPeopleMovedIn(peopleMovedIn);

            report.setEndingWheatInStorage(game.getWheatInStorage());
            report.setEndingPopulation(game.getCurrentPopulation());
            report.setEndingAcresOwned(game.getAcresOwned());

            return report;
        } catch (PeopleControlException ex) {
            ErrorView.display("People Control Exception:", ex.getMessage());
        }

        return null;
    }
}

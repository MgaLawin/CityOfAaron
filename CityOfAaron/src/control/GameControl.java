package control;

import Exceptions.GameControlException;
import Exceptions.PeopleControlException;
import Exceptions.WheatControlException;
import cityofaaron.CityOfAaron;
import java.util.Random;
import model.Author;
import model.Condition;
import model.Game;
import model.InventoryItem;
import model.ItemType;
import model.Storehouse;
import model.Player;
import model.Map;
import model.Animal;
import model.AnnualReport;
import model.Provision;
import view.ErrorView;

/**
 *
 * @author chelseawaite
 */
public class GameControl {

    private static Random randomGenerator = new Random();

    // create a a protected random number object for testing
    protected static void setRandomGenerator(Random random) {
        randomGenerator = random;
    }

    public static int getRandomNumber(int lowNumber, int highNumber) throws GameControlException {
        //if low < 0 or high< 0 then return -1
        if (lowNumber < 0 || highNumber < 0) {
            throw new GameControlException("\nLow and high numbers cannot be less than 0.\n");
        }

        //if high <= low return -2
        if (highNumber <= lowNumber) {
            throw new GameControlException("\nThe high number cannot be less than or equal to the low number.\n");
        }

        //if high is the max value for the integers return -3
        if (highNumber == Integer.MAX_VALUE) {
            throw new GameControlException("\nThe high number must be at least one less than the max value.\n");
        }
        // calculate the size of the range and add one so Random() includes highNumber
        int range = (highNumber - lowNumber) + 1;

        //return low and random(range size)
        return lowNumber + randomGenerator.nextInt(range);

    }

    public static String loadGameFromFile(String filename) {
        // place holder until created
        String name = filename;

        return name;

    }

    public static boolean gameShouldEnd(int mortalityRate) {
        //does not like 50% but it is 50 percent
        if (mortalityRate > 50) {
            return true;
        }
        return false;
    }

    public static boolean gameMatures(int yearNumber) {
        if (yearNumber > 10) {
            return true;
        }
        return false;
    }

    public static boolean saveGameToFile(Game game, String fileName) throws GameControlException {
        game = CityOfAaron.getCurrentGame();
        String name = fileName;

        if ( fileName == null || fileName.equals("")) {  
            throw new GameControlException("\nYou cannot have a blank filename.\n");
           
        }
        try {
            GameControl.saveGameToFile(game, fileName);
        } catch (GameControlException gce) {
            ErrorView.display("No file path provided", gce.getMessage());
            return false;
        }
        System.out.println("Your file was saved successfully! ");
        return true;
    }

    public static void saveReportToFile(String[] filename) {

    }

    public static Game createNewGame(String playerName) {
        //Returns a new Game object with everything initialized and ready for the first year of play.

        Player player = new Player();
        player.setName(playerName);

        Game game = new Game();
        game.setThePlayer(player);

        game.setCurrentPopulation(100);
        game.setAcresOwned(1000);
        game.setWheatInStorage(2700);

        Map theMap = MapControl.createMap();
        game.setTheMap(theMap);

        Storehouse storehouse = new Storehouse();

        //create the array
        Animal[] animals = createAnimals();
        InventoryItem[] tools = createTools();
        Provision[] provisions = createProvisions();
        Author[] author = createAuthor();

        //call the method
        storehouse.setAuthors(author);
        storehouse.setTools(tools);
        storehouse.setProvisions(provisions);
        storehouse.setAnimals(animals);
        game.setTheStorehouse(storehouse);

        return game;
    }

    public static InventoryItem[] createTools() {
        //create and array large enough to hold all the elements in the list
        // create the next object to be added to the array

        InventoryItem[] inventory = new InventoryItem[7];
        inventory[0] = new InventoryItem("Lumber", ItemType.TOOL, 25, Condition.Good);
        inventory[1] = new InventoryItem("Hammer", ItemType.TOOL, 8, Condition.Good);
        inventory[2] = new InventoryItem("Drill", ItemType.TOOL, 1, Condition.Good);
        inventory[3] = new InventoryItem("Shovel", ItemType.TOOL, 2, Condition.Good);
        inventory[4] = new InventoryItem("Sickle", ItemType.TOOL, 3, Condition.Good);
        inventory[5] = new InventoryItem("Saw", ItemType.TOOL, 1, Condition.Good);
        inventory[6] = new InventoryItem("nails", ItemType.TOOL, 200, Condition.Good);

        return inventory;
    }

    public static String sumTools() {
        long total = 0;
        InventoryItem[] tools = createTools();

        String endingString = "";
        endingString += ("--------------------------------------------\n"
                + "-      Tools in Storehouse                 -\n"
                + "--------------------------------------------\n");

        if (tools == null) {
            endingString += ("You currently have zero tools in the storehouse, please add some.");
        } else {
            String toolName;
            int numberTools;
            //loop through the tools array get name and number of tools

            for (int i = 0; i < tools.length; i++) {
                toolName = tools[i].getname();
                numberTools = tools[i].getquantity();
                endingString += (toolName + "-- " + numberTools + "\n");
                total += numberTools;
            }
        }

        endingString += ("There are:  " + total + " tools in the Storehouse. \n");

        return endingString;

    }

    public static Animal[] createAnimals() {

        //literal array for animals with name quantity condition age
        Animal[] animals = {
            new Animal("Cow", 5, Condition.Good, 2),
            new Animal("Horse", 5, Condition.Good, 7),
            new Animal("Goat", 2, Condition.Good, 3),
            new Animal("Chicken", 25, Condition.Good, 1)
        };
        return animals;
    }

    public static Provision[] createProvisions() {

        // literal array for provisions for name quantity condition perishable
        Provision[] provisions = {
            new Provision("Honey", 15, Condition.Good, false),
            new Provision("Oil", 35, Condition.Good, true),
            new Provision("Salt", 200, Condition.Good, false),
            new Provision("Wheat", 2000, Condition.Good, true),
            new Provision("Water", 1025, Condition.Good, true)
        };
        return provisions;
    }

    //literal array for authors- deon helped
    public static Author[] createAuthor() {
        Author[] author = {
            new Author("Chelsea", "Super Coder"),
            new Author("Jeremy", "Amazing Programmer"),
            new Author("Deon", "Coder Programmer")
        };
        return author;
    }

    public static AnnualReport calcLiveTheYear(
            Game game, int tithingPercent,
            int bushelsForFood, int acresPlanted
    ) throws GameControlException, WheatControlException, PeopleControlException {
        if (game == null || tithingPercent < 0 || tithingPercent > 100 || bushelsForFood < 0 || acresPlanted < 0) {
            throw new GameControlException("Tithing percent, bushels for food, or acres to plant is invalid.");
        }

        AnnualReport report = new AnnualReport();
        report.setLandPrice(LandControl.getCurrentLandPrice());

        int totalWheat = game.getWheatInStorage();

        int harvested = 0;
        int lostToRats = 0;
        int peopleStarved = 0;
        int peopleMovedIn = 0;

        try {
            harvested = WheatControl.calculateHarvest(tithingPercent, acresPlanted);
        } catch (WheatControlException ie) {
            ErrorView.display("GameControl",
                    "Error calculating harvest" + ie.getMessage());
            throw new GameControlException("Cannot calculate harvest.");
        }
        int tithingAmount = (int) (double) ((tithingPercent / 100.0) * harvested);

        try {
            lostToRats = WheatControl.calculateLossToRats(tithingPercent, totalWheat);
        } catch (WheatControlException ie) {
            ErrorView.display("GameControl", ie.getMessage());
            throw new GameControlException("Cannot calculate the amount of wheat lost to rats.");
        }

        peopleStarved = PeopleControl.calculateMortality(bushelsForFood, game.getCurrentPopulation());
        peopleMovedIn = PeopleControl.calculateNewMoveIns(game.getCurrentPopulation());

        totalWheat = totalWheat + harvested - tithingAmount - lostToRats;
        game.setWheatInStorage(totalWheat);
        game.setCurrentPopulation(game.getCurrentPopulation() - peopleStarved + peopleMovedIn);

        report.setBushelsHarvested(harvested);
        report.setTithingAmount(tithingAmount);
        report.setLostToRats(lostToRats);
        report.setPeopleStarved(peopleStarved);
        report.setPeopleMovedIn(peopleMovedIn);

        report.setEndingWheatInStorage(game.getWheatInStorage());
        report.setEndingPopulation(game.getCurrentPopulation());
        report.setEndingAcresOwned(game.getAcresOwned());

        return report;
    }
}

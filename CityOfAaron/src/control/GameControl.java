package control;

import cityofaaron.CityOfAaron;
import java.util.Random;
import model.Author;
import model.Game;
import model.Storehouse;
import model.Player;
import model.Map;

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

    public static int getRandomNumber(int lowNumber, int highNumber) {

        //if low < 0 or high< 0 then return -1
        if (lowNumber < 0 || highNumber < 0) {
            return -1;
        }

        //if high <= low return -2
        if (highNumber <= lowNumber) {
            return -2;
        }

        //if high is the max value for the integers return -3
        if (highNumber == Integer.MAX_VALUE) {
            return -3;
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
        if (mortalityRate > 0) {
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

    public static void saveGameToFile(Game game, String filename) {

    }

    public static void saveReportToFile(String[] filename) {

    }

    public static Game createNewGame(String playerName) {
        //Returns a new Game object with everything initialized and ready for the first year of play.

        Player player = new Player();
        player.setName(playerName);

        Game game = new Game();
        game.setThePlayer(player);

        game.setCurrentPopulation(1000);
        game.setAcresOwned(3000);
        game.setWheatInStorage(2700);

        Map theMap = MapControl.createMap();
        game.setTheMap(theMap);

        Storehouse storehouse = new Storehouse();

        //literal array for authors- deon helped
        Author[] author = {
            new Author("Chelsea", "Super Coder"),
            new Author("Jeremy", "Amazing Programmer"),
            new Author("Deon", "Coder Programmer")
        };

        storehouse.setAuthors(author);
        game.setTheStorehouse(storehouse);

        return game;
    }

//    public void InventoryItem[] createItems(){
//        InventoryItem.setItemType(item);
//        InventoryItem.setQuantity(quantity);
//        InventoryItem.setCondition(condtion);
}

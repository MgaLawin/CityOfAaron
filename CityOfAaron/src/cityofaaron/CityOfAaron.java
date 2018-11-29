package cityofaaron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import model.Game;
import model.Player;
import model.Storehouse;
import model.Map;
import view.View;
import view.StartProgramView;

/**
 *
 * @author Jeremy
 */
public class CityOfAaron {

    public static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            View startProgramView = new StartProgramView();
            startProgramView.displayView();
        } catch (Throwable te) {
            System.out.println("This game is not loading, sorry. Have a great day!");
            System.out.println(te.getMessage());

        }

    }

}

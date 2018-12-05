package cityofaaron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }
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
            CityOfAaron.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            CityOfAaron.outFile = new PrintWriter(System.out, true);
            View startProgramView = new StartProgramView();
            startProgramView.displayView();
        } catch (Throwable te) {
            System.out.println("Exception : " + te.toString()
                    + "\nCause:  " + te.getCause()
                    + "\nMessage: " + te.getMessage()
            );

            te.printStackTrace();

        } finally {
            try {
                if (CityOfAaron.inFile != null)
                    CityOfAaron.inFile.close();
                if (CityOfAaron.outFile != null)
                    CityOfAaron.outFile.close();
                
            } catch (IOException ex) {
            //   Logger.getLogger(CityOfAaron.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error closing the input/output files..sorry!");
            return;
            }
        }
    }
}

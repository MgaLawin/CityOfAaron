/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiw;

import CityOfAaron.cityofaaron;
import model.player;
import model.Game;
import.java.util.Scanner;

/**
 *
 * @author DIDIM
 */
public class NewGameView {
    

    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public ViewTemplate(){
        
        message = "Let's start a new game!\n"
                
                + "2 - Replace this list with menu options that are specific to your view.\n"
                + "\n"
                + "3 - Prompt the user for what they are expected to enter.\n";
                
    }
    
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Please enter your name, or hit the 'enter' key to return to the Main menu:");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        if (inputs[0] == null || inputs[0].equals("")){
            System.out.println("You did not enter a valid name. Returning to the Main menu. . . ");
            return false;
        }
        // return false if you want this view to exit and return
        // to the view that called it.
        String PlayerName= inputs[0];
        createAndStartGame(playerName);
        //return false so we do not keep looping
        return false;
        
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    
    private void createAndStartGame(String playerName){
        // This will be done at a later date
        
        Player player = new Player();
        player.setName(playerName);
        
        Game game = new Game;
        game.setThePlayer(player);
        
        cityofaaron.SetCurrentGame(game);
        
        System.out.println();
        System.out.println("Welcome to the game, " + cityofaaron.getCurrentGame().getThePlayer().getName() + "!\n"
                                    +"Next week we will have a GameMenuView that you can see, but for now,\n"
                                    + "we are just going to send you back to the main menu. Sorry.\n");
        
        
        //when GameMenuView is created we will call it here.
        //GameMenuView gameMenu= new GameMenuView();
        //gameMenu.displayView();
    }
}
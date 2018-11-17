/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author DIDIM
 */
public class EndGameView extends ViewBase {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public EndGameView() {
      
    }

    @Override
    protected String getMessage() {

        return "\n\n****************************************************************************************\n"
                + " Thank you for playing the game today. Your game has ended. \n"
                + "Would you like to play again? Enter Y- to play again or N- to quit\n"            
                + "******************************************************************************************\n";

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

        inputs[0] = getUserInput("What would you like to do? Enter Y/N.\n");

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
        // If the user hits y- display the main menu, if no display a goodbye message
        switch (inputs[0].trim().toUpperCase()) {
            case "Y":
                MainMenuView();
                break;
          
            case "N":
                System.out.println("Thank you for playing. Good-Bye.\n");
                MainMenuView();
                break;
        }
        return true;
    }
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    private void MainMenuView() {
        //Call the gamemenuview
        MainMenuView view = new MainMenuView();
        view.displayView();
    }
    
       
}
